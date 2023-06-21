package org.example;

public class BadResearch {
    // high-level module
    private final BadRelationships relationships;

    public BadResearch(BadRelationships badRelationships) {
        this.relationships = badRelationships;
    }

    public void doResearch(String parentName) {
        relationships.getRelationships().stream()
                .filter(r -> r.getValue0().name().equals(parentName) && r.getValue1() == Relationship.PARENT)
                .forEach(r -> System.out.println(parentName + " has a child called " + r.getValue2().name()));
    }
}
