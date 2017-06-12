package controllers;
import javax.inject.Inject;

import play.mvc.*;
import play.libs.ws.*;

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

import models.Port;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class PortController extends Controller {

    @Inject WSClient ws;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(Long deviceId) {
        List<Port> portElement = new ArrayList<Port>();

        WSRequest request = ws.url("http://192.168.100.1:8000/devices/" + deviceId + "/ports");

        CompletionStage<Document> responseDocument = request.get()
                .thenApply(WSResponse::asXml);

        Document portDocument = responseDocument
                .toCompletableFuture().join();

        NodeList portList = portDocument.getElementsByTagName("port");
        String device = portDocument.getElementsByTagName("device").item(0).getTextContent();

        for (int temp = 0; temp < portList.getLength(); temp++) {

            Node nNode = portList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                Port p = new Port();

                p.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                p.setIn(Long.parseLong(eElement.getElementsByTagName("in").item(0).getTextContent()));
                p.setOut(Long.parseLong(eElement.getElementsByTagName("out").item(0).getTextContent()));

                portElement.add(p);
            }
        }

        return ok(views.html.ports.render(portElement, device));
    }

    /**
     * Affiche les graphs des ports d'un device
     *
     * @param id: id du device
     * @return ok: retourne un code 200 avec la vue
     *
     */
    public Result show(Long deviceId, Long portId) {
        WSRequest request = ws.url("http://192.168.100.1:8000/devices/" + deviceId + "/ports/" + portId);

        CompletionStage<Document> responseDocument = request.get()
                .thenApply(WSResponse::asXml);

        Document portDocument = responseDocument
                .toCompletableFuture().join();

        NodeList portList = portDocument.getElementsByTagName("port");
        String device = portDocument.getElementsByTagName("device").item(0).getTextContent();

        Node portNode = portList.item(0);

        Element elementNode = (Element) portNode;

        Port p = new Port();

        p.setName(elementNode.getElementsByTagName("name").item(0).getTextContent());
        p.setIn(Long.parseLong(elementNode.getElementsByTagName("in").item(0).getTextContent()));
        p.setOut(Long.parseLong(elementNode.getElementsByTagName("out").item(0).getTextContent()));

        return ok(views.html.port.render(portId, p, device));
    }

}

