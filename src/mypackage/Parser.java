package mypackage;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Damian on 2016-10-16.
 */


class Parser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        double x =8.0/0;
        double d = .77 + .23;
        System.out.println(d);
       // System.out.println(x);
//        File file = new File("C:/users/damian/desktop");
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        Document doc = builder.parse(file);
//        doc.getDocumentElement().normalize();
    }
}
