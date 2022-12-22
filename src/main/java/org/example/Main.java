package org.example;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        TimedDocument info = new TimedDocument(document);
        System.out.println(info.getTimePassed());
    }
}