package org.example;

public class MultiFunctionPrinter implements BadMachineInterface {
    // this works, because it is multifunction
    @Override
    public void print(Document document) {
        // implement
    }

    @Override
    public void scan(Document document) {
        // implement
    }

    @Override
    public void copy(Document document) {
        // implement
    }
}
