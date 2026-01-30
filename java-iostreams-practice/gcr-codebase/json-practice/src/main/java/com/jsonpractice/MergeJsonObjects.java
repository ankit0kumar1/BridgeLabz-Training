package com.jsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read both JSON objects
        ObjectNode json1 = (ObjectNode) mapper.readTree(new File("src/main/java/resources/json1.json"));
        ObjectNode json2 = (ObjectNode) mapper.readTree(new File("src/main/java/resources/json2.json"));

        // Merge json2 into json1
        json1.setAll(json2);

        // Print merged JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(json1));

        // Save merged output
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("merged.json"), json1);
    }
}

