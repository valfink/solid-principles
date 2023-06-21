package org.example.dependency_inversion;

import org.example.Person;
import org.example.Relationship;
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

public class Relationships implements RelationshipBrowser {
    private final List<Triplet<Person, Relationship, Person>> relationshipList = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relationshipList.add(new Triplet<>(parent, Relationship.PARENT, child));
        relationshipList.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findChildrenOf(String name) {
        return relationshipList.stream()
                .filter(r -> r.getValue0().name().equals(name) && r.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .toList();
    }
}
