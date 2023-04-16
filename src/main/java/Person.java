package main.java;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE, OTHER
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday, currentDate);
        return period.getYears();

    }

    public void printPerson() {
        String bdayString = birthday.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(name + bdayString + gender + emailAddress);

    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        LocalDate bday = LocalDate.parse("2007-01-08");
        Person one = new Person("John", bday, Person.Sex.OTHER, "nobody@nowhere.com");
        one.printPerson();
    }
}