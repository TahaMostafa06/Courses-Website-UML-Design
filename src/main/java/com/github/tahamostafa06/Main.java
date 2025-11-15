package com.github.tahamostafa06;

import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var elem = JsonParser.parseString("{\"Age\": 2}");
        System.out.println(elem.getAsJsonObject().get("Age"));
    }
}