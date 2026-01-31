package com.JSON.HandsOnProblems;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        Object data = jsonMapper.readValue(
                new File("data/user.json"),
                Object.class
        );

        xmlMapper.writeValue(new File("output.xml"), data);

        System.out.println("XML file created successfully");
    }
}
