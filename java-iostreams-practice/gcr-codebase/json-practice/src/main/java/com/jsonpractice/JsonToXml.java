package com.jsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
    public static void main(String[] args) throws Exception {

        String json = """
                {
                  "name": "Ankit",
                  "email": "ankit@gmail.com",
                  "age": 21
                }
                """;

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode = jsonMapper.readTree(json);

        // JSON -> XML
        String xml = xmlMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonNode);

        System.out.println(xml);
    }
}

