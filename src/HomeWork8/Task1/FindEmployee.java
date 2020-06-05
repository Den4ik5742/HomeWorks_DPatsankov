package HomeWork8.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindEmployee {


    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("cd_catalog.xml"));

        NodeList employeeElements = document.getDocumentElement().getElementsByTagName("employee");

        for (int i = 0; i < employeeElements.getLength(); i++) {
            Node employee = employeeElements.item(i);
            NamedNodeMap attributes = employee.getAttributes();
            employees.add(new Employee(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("surname").getNodeValue(), attributes.getNamedItem("position").getNodeValue(), attributes.getNamedItem("stage").getNodeValue()));
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите name:");
        String name = in.next();
        System.out.println("Введите surname:");
        String surname = in.next();
        for (Employee employee : employees) {
            if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
                System.out.println(String.format("Employee name %s, surname %s, position %s , stage %s", employee.getName(), employee.getSurname(), employee.getPosition(), employee.getStage()));
            }
        }
    }
}
