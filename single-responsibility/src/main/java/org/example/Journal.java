package org.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private int count = 0;

    public void addEntry(String text) {
        entries.add((++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // BREAKING SRP - data persistence is another concern and should not be part of the Journal!
    public void saveToFile(String filename) throws FileNotFoundException {
        try (PrintStream printStream = new PrintStream(filename)) {
            printStream.println(this);
        }
    }
}
