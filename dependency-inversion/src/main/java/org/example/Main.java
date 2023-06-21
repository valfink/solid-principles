package org.example;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John");
        Person chris = new Person("Chris");
        Person sarah = new Person("Sarah");

        BadRelationships badRelationships = new BadRelationships();
        badRelationships.addParentAndChild(john, chris);
        badRelationships.addParentAndChild(john, sarah);

        // BAD: the high-level module depends on the low-level module and also on the implementation!
        BadResearch badResearch = new BadResearch(badRelationships);
        badResearch.doResearch("John");
    }
}