package org.example;

import lombok.Getter;
public class TimedDocument {
    private Document document;
    @Getter
    private double timePassed;
    public TimedDocument(Document document) {
        this.document = document;
        long startTime = System.nanoTime();
        this.document.parse();
        long finalTime = (System.nanoTime() - startTime);
        this.timePassed = (double)finalTime / 1_000_000_000.0;
    }
}
