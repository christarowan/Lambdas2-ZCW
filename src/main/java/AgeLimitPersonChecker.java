package main.java;

import main.java.Person;

public class AgeLimitPersonChecker implements CheckPerson {

    @Override
    public boolean test(Person p) {
        // TODO Auto-generated method stub
        if (p.getAge() < 30) {
            return true;
        }
        return false;
    }
}
