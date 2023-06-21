package org.example.interface_segregation;

import org.example.Document;

public interface MultifunctionMachine extends Printer, Scanner {
    public void copy(Document document);
}
