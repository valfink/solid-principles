package org.example.dependency_inversion;

import org.example.Person;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findChildrenOf(String name);
}
