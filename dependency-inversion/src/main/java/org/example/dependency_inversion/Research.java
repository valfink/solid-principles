package org.example.dependency_inversion;

import org.example.Person;

import java.util.List;

public class Research {
    // GOOD: depending on abstraction, not implementation!
    private final RelationshipBrowser relationshipBrowser;

    public Research(RelationshipBrowser relationshipBrowser) {
        this.relationshipBrowser = relationshipBrowser;
    }

    public void doResearch(String name) {
        List<Person> children = relationshipBrowser.findChildrenOf(name);
        for (Person child : children) {
            System.out.println(name + " has a child called " + child.name());
        }
    }
}
