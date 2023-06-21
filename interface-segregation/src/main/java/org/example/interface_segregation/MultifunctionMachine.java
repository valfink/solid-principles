package org.example.interface_segregation;

import org.example.Document;

public interface MultifunctionMachine extends Printer, Scanner {
    void copy(Document document);
}
