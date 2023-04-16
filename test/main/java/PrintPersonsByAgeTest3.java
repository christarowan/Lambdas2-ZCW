package test.main.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import main.java.Person;
import main.java.CheckPerson;

public class PrintPersonsByAgeTest3 {
    public static void main(String[] args) {
        LocalDate bOne = LocalDate.parse("1923-01-08");
        LocalDate bTwo = LocalDate.parse("2001-01-08");
        LocalDate bThree = LocalDate.parse("2007-01-08");
        Person p1 = new Person("John", bOne, Person.Sex.OTHER, "nobody@nowhere.com");
        Person p2 = new Person("Delila", bTwo, Person.Sex.OTHER, "nobody@nowhere.com");
        Person p3 = new Person("Zarathustra", bThree, Person.Sex.OTHER, "nobody@nowhere.com");
        ArrayList<Person> peeps = new ArrayList<Person>(3);
        peeps.add(p1);
        peeps.add(p2);
        peeps.add(p3);

        // Lambda expression to implement CheckPerson interface
        CheckPerson checker = p -> p.getAge() < 30;
        Person.printPersons(peeps, checker);

    }
}
