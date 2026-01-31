package com.jsonpractice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ankit", "ankit@gmail.com"));
        list.add(new Student(2, "Rahul", "rahul@gmail.com"));

        ObjectMapper mapper = new ObjectMapper();

        // Convert List to JSON Array String
        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(list);

        System.out.println(jsonArray);
    }
}

