package com.jsonpractice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class ExtractSpecificFeilds {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        JsonNode root = mapper.readTree(new File("src/main/java/resources/students.json"));

        ArrayNode output = mapper.createArrayNode();

        // Loop JSON array
        for (JsonNode node : root) {
            ObjectNode obj = mapper.createObjectNode();

            // Extract only required fields
            obj.put("id", node.get("id").asInt());
            obj.put("name", node.get("name").asText());
//            obj.put("email", node.get("email").asText());

            output.add(obj);
        }

        // Print output JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output));

        // Save to new file
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("filtered.json"), output);
    }
}

