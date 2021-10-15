package com.logicbig.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        View v = new View();
        v.setShapes(new ArrayList<>(List.of(new Rectangle(3,5), new Circle(4))));

        System.out.println("-- serializing --");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(v);
        System.out.println(s);

        System.out.println("-- deserializing --");
        View view = objectMapper.readValue(s, View.class);
        System.out.println(view);
    }
}