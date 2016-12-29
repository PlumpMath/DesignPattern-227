package SimpleFactoryPattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Heyha on 2016/12/29.
 */
public class XmlUtil {
    public static String getProductType(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.parse(new File("config.xml"));

            NodeList list = document.getElementsByTagName("charType");
            Node node = list.item(0).getFirstChild();
            String type = node.getNodeValue().trim();
            if (type != null && type != ""){
                return type;
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return null;
        } catch (SAXException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
