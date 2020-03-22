package com.pattern.creational.simplefactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/3
 * [email]    :     kingjavip@gmail.com
 */
public class SimpleFactoryTest {
    public <T> T getProdect(Class<T> clazz) {
        T t=null;
        try {
             t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;

    }

    public static void main(String[] args) {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("xml.xml"));
            NodeList xmlInfo = doc.getElementsByTagName("xmlInfo");
            Node firstChild = xmlInfo.item(0).getFirstChild();
            String info = firstChild.getNodeValue().trim();
            System.out.println(info);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
