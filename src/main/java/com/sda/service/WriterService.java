package com.sda.service;

public class WriterService {
    public String write(String name) {
        return prefix(name) + content(name) + suffix(name);
    }

    private String suffix(String name) {
        return isCapitalizedName(name) ? "!" : ".";
    }

    private String content(String name) {
        return name == null ? "my friend" : name;
    }

    private String prefix(String name) {
        return isCapitalizedName(name) ? "HELLO, " : "Hello, ";
    }

    private boolean isCapitalizedName(String name) {
        return name != null && name.toUpperCase().equals(name);
    }

//    public String write (String name) {
//        if (name == null) return "Hello, my friend.";
//        String hello = "Hello, ";
//        String end1 = "!";
//        String end2 = ".";
//        return name.toUpperCase().equals(name) ? hello.toUpperCase() + name + end1 : hello + name + end2;
//    }
}
