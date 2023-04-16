package main.java;

import main.java.Person;

public class AgeLimitPersonChecker3 {
    public static void main(String[] args) {
        // ... other code ...
        CheckPerson checker = (Person p) -> p.getAge() < 30;
        Person.printPersons(peeps, checker);
    }
}