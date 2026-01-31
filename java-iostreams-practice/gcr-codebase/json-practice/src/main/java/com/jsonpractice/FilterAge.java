package com.jsonpractice;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON array file
        JsonNode root = mapper.readTree(new File("src/main/java/resources/users.json"));

        ArrayNode filtered = mapper.createArrayNode();

        for (JsonNode user : root) {
            int age = user.get("age").asInt();

            if (age > 25) {
                filtered.add(user);
            }
        }

        // Print filtered JSON
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(filtered));

        // Save to file
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("filtered_age.json"), filtered);
    }
}
