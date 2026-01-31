package com.jsonpractice;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintJsonKeysValues {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("src/main/java/resources/json1.json"));

        printJson(root, "");
    }

    static void printJson(JsonNode node, String path) {

        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), path + entry.getKey() + ".");
            }

        } else if (node.isArray()) {
            for (int i = 0; i < node.size(); i++) {
                printJson(node.get(i), path + "[" + i + "].");
            }

        } else {
            // leaf value
            System.out.println(path.substring(0, path.length() - 1) + " = " + node.asText());
        }
    }
}

