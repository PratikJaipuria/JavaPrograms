import org.w3c.dom.*;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

public class Folders {

    public static Collection<String> folderNames(String xmlRecords, char startingLetter) throws Exception {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
//            System.out.println(xmlRecords);
            ArrayList<String> result = new ArrayList<>();
            is.setCharacterStream(new StringReader(xmlRecords));
            Document doc = db.parse(is);
            //doc.getDocumentElement().normalize();
            NodeList entries = doc.getElementsByTagName("folder");
            int num = entries.getLength();
            for (int j=0; j<num; j++) {

                Element node = (Element) entries.item(j);
                NamedNodeMap attributes = node.getAttributes();
                int numAttrs = attributes.getLength();

//                for (int i = 0; i < numAttrs; i++) {
                Attr attr = (Attr) attributes.item(0);
                String attrName = attr.getNodeName();

                String attrValue = attr.getNodeValue();
                if(attrName.equals("name") && attrValue.charAt(0)==startingLetter)
                {
                    result.add(attrValue);
//                    System.out.println("Found attribute: " + attrName + " with value: " + attrValue);
                }

//                }
                }

        return result;
    }



    public static void main(String[] args) throws Exception{

        String xml_old =
//                "<folder name>" ;
               "<?xml version =\"1.0\" encoding=\"UTF-8\" ?>"+
               "<folder name=\"c\">"+
                      "<folder name=\"program files\">" +
                            "<folder name=\"uninstall information\" />"+
                      "</folder>"+
                      "<folder name=\"users\" />"+
                "</folder>";


        System.out.println(folderNames(xml_old,'u'));
        String s = "Pratik";
        s.concat("Jaipuria");

        System.out.println(s);

    }
}
