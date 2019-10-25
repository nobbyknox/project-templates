package com.nobbyknox;

public class App {
    public static void main(String[] args) {
        System.out.println(greeter("World!"));
    }

    static String greeter(String name) {
        return "Hello ".concat(name);
    }
}
