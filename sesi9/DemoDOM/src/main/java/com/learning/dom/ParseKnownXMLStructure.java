package com.learning.dom;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ParseKnownXMLStructure{
	public static void main(String[] args)throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.parse(new File("src/main/resources/employees.xml"));
		
		document.getDocumentElement().normalize();
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nList = document.getElementsByTagName("employee");
		System.out.println("================================");
		
		for(int temp=0; temp <nList.getLength(); temp++) {
			Node node = nList.item(temp);
			System.out.println("");
			if(node.getNodeType()== Node.ELEMENT_NODE) {
				Element eElement =(Element) node;
				System.out.println("Employee id" + eElement.getAttribute("id"));
				System.out.println("First Name" + eElement.getAttribute("firstName"));
				System.out.println("Last Name" + eElement.getAttribute("lastName"));
				System.out.println("Location" + eElement.getAttribute("location"));
			}
		}
	}
}