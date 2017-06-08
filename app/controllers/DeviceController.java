package controllers;
import javax.inject.Inject;

import play.mvc.*;
import play.libs.ws.*;
import java.util.concurrent.CompletionStage;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class DeviceController extends Controller {

    @Inject WSClient ws;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {


        return ok(views.html.index.render());
    }

    /**
     * Affiche les graphs des ports d'un device
     *
     * @param id: id du device
     * @return ok: retourne un code 200 avec la vue
     */
    public Result show(Long id) {
        CompletionStage<Document> responseDocument = ws.url("http://192.168.100.1/devices/" + id).get()
                .thenApply(WSResponse::asXml);

        Document deviceDocument = responseDocument.toCompletableFuture().get();

        NodeList deviceList = deviceDocument.getElementsByTagName("switch");

        ArrayList<Element> deviceElement = new ArrayList<Element>();

        for (int temp = 0; temp < deviceList.getLength(); temp++) {

            Node nNode = deviceList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                deviceElement.add(eElement);
            }
        }

        return ok(views.html.device.render(id, deviceElement));
    }

}
