package createpattern.open;

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

    public static volatile XmlUtil INSTANCE = null;

    private XmlUtil() {
    }

    public static XmlUtil getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (XmlUtil.class) {
                if (INSTANCE == null) {
                    INSTANCE = new XmlUtil();
                }
            }
        }
        return INSTANCE;
    }

    private Document getDocument() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = dbf.newDocumentBuilder();
            Document document = builder.parse(new File("config.xml"));
            builder = null;
            dbf = null;
            if (document != null) {
                return document;
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取到xml文件中type下的值
     *
     * @param type
     * @return
     */
    public String getType(String type) {
        Document document = getDocument();
        if (document != null) {
            NodeList list = document.getElementsByTagName(type);
            Node node = list.item(0).getFirstChild();
            String types = node.getNodeValue().trim();
            if (type != null && type != "") {
                return types;
            }
        }
        return null;
    }

    /**
     * 根据xml中的标签名称获取类的实例
     *
     * @param objName
     * @return
     */
    public Object getBean(String path,String objName) {
        String cName = getType(objName);
        Class c = null;
        Object obj = null;
        try {
            //注意此处是需要带包名（路径要准确）
            c = Class.forName(path + cName);
            obj = c.newInstance();
            return obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}



