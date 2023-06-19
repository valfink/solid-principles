package org.example;

public class Main {
    public static void main(String[] args) {
        Journal j = new Journal();
        j.addEntry("I woke up happy today.");
        j.addEntry("I learned some more Java.");
        System.out.println(j);
    }
}