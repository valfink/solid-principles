package org.example;

public class ClassicPrinterOnBadInterface implements BadMachineInterface {
    @Override
    public void print(Document document) {
        // implement
    }

    @Override
    public void scan(Document document) {
        // OH NO :(
        // THIS IS NOT PART OF A PRINTER!
    }

    @Override
    public void copy(Document document) {
        // OH NO :(
        // THIS IS NOT PART OF A PRINTER!
    }
}
