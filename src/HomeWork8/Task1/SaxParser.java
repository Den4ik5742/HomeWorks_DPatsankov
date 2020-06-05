package HomeWork8.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SaxParser {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XmlHandler handler = new XmlHandler();
        parser.parse(new File("cd_catalog.xml"), handler);

        for (Employee employee : employees) {
            System.out.println(String.format("Employee name %s, surname %s, position %s , stage %s", employee.getName(), employee.getSurname(), employee.getPosition(), employee.getStage()));
        }
    }

    private static class XmlHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String name = attributes.getValue("name");
                String surname = attributes.getValue("surname");
                String position = attributes.getValue("position");
                String stage = attributes.getValue("stage");
                employees.add(new Employee(name, surname, position, stage));
            }
        }
    }
}
