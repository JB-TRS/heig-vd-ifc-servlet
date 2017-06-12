package controllers;
import javax.inject.Inject;

import play.mvc.*;
import play.libs.ws.*;
import play.data.*;
import play.data.FormFactory.*;
import static play.data.Form.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CompletionStage;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import models.Device;
import models.Port;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class DeviceController extends Controller {

    @Inject WSClient ws;
    String restUrl = "http://127.0.0.1:8000";

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Form<Device> deviceForm = form(Device.class);
        List<Device> deviceElement = new ArrayList<Device>();

        WSRequest request = ws.url(restUrl + "/devices");

        CompletionStage<Document> responseDocument = request.get()
                .thenApply(WSResponse::asXml);

        Document deviceDocument = responseDocument
                .toCompletableFuture().join();

        NodeList deviceList = deviceDocument.getElementsByTagName("switch");

        for (int temp = 0; temp < deviceList.getLength(); temp++) {

            Node nNode = deviceList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                Device d = new Device();

                d.setId(Long.parseLong(eElement.getAttribute("id")));
                d.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                d.setIpAddress(eElement.getElementsByTagName("ip").item(0).getTextContent());

                deviceElement.add(d);
            }
        }

        return ok(views.html.devices.render(deviceElement, deviceForm));
    }

    /**
     * Ajoute un nouveau switch
     *
     * @return ok: retourne un code 200 avec la vue
     */
    public Result submit() {
        Form<Device> deviceForm = Form.form(Device.class).bindFromRequest();
        if (deviceForm.hasErrors()) {
            return badRequest("/");
        } else {
            Device device = deviceForm.get();

            JsonNode json = Json.newObject()
                    .put("name", device.getName())
                    .put("ip", device.getIpAddress());

            ws.url(restUrl + "/devices").setHeader("Content-Type", "application/json").post(json);

            return redirect("/devices");
        }
    }

    /**
     * Affiche les graphs des ports d'un device
     *
     * @param id: id du device
     * @return ok: retourne un code 200 avec la vue
     */
    public Result show(Long id) {
        Form<Port> portForm = form(Port.class);

        WSRequest request = ws.url(restUrl + "/devices/" + id);

        CompletionStage<Document> responseDocument = request.get()
                .thenApply(WSResponse::asXml);

        Document deviceDocument = responseDocument
                .toCompletableFuture().join();

        NodeList deviceList = deviceDocument.getElementsByTagName("switch");

        Node deviceNode = deviceList.item(0);

        Element elementNode = (Element) deviceNode;

        Device d = new Device();

        d.setId(Long.parseLong(elementNode.getAttribute("id")));
        d.setName(elementNode.getElementsByTagName("name").item(0).getTextContent());
        d.setIpAddress(elementNode.getElementsByTagName("ip").item(0).getTextContent());

        return ok(views.html.device.render(d, portForm));
    }

}
