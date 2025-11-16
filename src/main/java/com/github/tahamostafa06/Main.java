package com.github.tahamostafa06;

import com.google.gson.Gson;

class Test {
    private final String e;
    public final String b;

    public Test(String e, String b) {
        this.e = e;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();
        var test = gson.fromJson("{\"e\": \"1\", \"a\": \"3\"}", Test.class);
        System.out.println("Hello world!");
    }
}