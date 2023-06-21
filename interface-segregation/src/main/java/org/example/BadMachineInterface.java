package org.example;

public interface BadMachineInterface {
    // this violates interface segregation principle
    // the interface should only contain the methods that a user will definitely implement
    void print (Document document);
    void scan (Document document);
    void copy (Document document);
}
