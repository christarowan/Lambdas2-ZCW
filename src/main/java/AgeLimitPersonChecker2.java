package main.java;

class Main {
    public static void main(String[] args) {

        Person person = new Person(null, null, null, null);

        // Implementing AgeLimitPersonChecker as an anonymous class
        CheckPerson ageLimitChecker = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                if (p.getAge() < 30) {
                    return true;
                }
                return false;
            }
        };

        // Using the ageLimitChecker to test the Person object
        boolean result = ageLimitChecker.test(person);
        System.out.println("Result: " + result);
    }
}