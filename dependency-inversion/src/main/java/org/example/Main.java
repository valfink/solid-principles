package org.example;

import org.example.dependency_inversion.Relationships;
import org.example.dependency_inversion.Research;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John");
        Person chris = new Person("Chris");
        Person sarah = new Person("Sarah");

        BadRelationships badRelationships = new BadRelationships();
        badRelationships.addParentAndChild(john, chris);
        badRelationships.addParentAndChild(john, sarah);

        // BAD: the high-level module depends on the low-level module and also on the implementation!
        System.out.println("BAD WAY:");
        BadResearch badResearch = new BadResearch(badRelationships);
        badResearch.doResearch("John");

        // GOOD
        Relationships goodRelationships = new Relationships();
        goodRelationships.addParentAndChild(john, chris);
        goodRelationships.addParentAndChild(john, sarah);

        System.out.println("GOOD WAY");
        Research goodResearch = new Research(goodRelationships);
        goodResearch.doResearch("John");
    }
}