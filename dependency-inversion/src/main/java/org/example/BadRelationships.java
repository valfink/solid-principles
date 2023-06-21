package org.example;

import org.javatuples.Triplet;

import javax.management.relation.Relation;
import java.util.ArrayList;
import java.util.List;

public class BadRelationships {
    // low-level module - no business logic, only for storing data
    private final List<Triplet<Person, Relationship, Person>> relationships = new ArrayList<>();

    public List<Triplet<Person, Relationship, Person>> getRelationships() {
        return relationships;
    }

    public void addParentAndChild(Person parent, Person child) {
        relationships.add(new Triplet<>(parent, Relationship.PARENT, child));
        relationships.add(new Triplet<>(child, Relationship.CHILD, parent));
    }
}
