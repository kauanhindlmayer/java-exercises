package entities;

public class Agenda {
    Person[] people = new Person[10];

    public void addPerson(Person person) {
        if (people.length == 0) {
            people[0] = person;
        } else {
            people[people.length - 1] = person;
        }
    }

    public void removePerson(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (person.equals(people[i])) {
                people[i] = null;
            }
        }
    }

    public int searchPerson(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (person.equals(people[i])) {
                return i;
            }
        }

        return -1;
    }

    public void printAgenda() {
        System.out.println("Agenda: ");
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1) + ": " + people[i]);
        }
    }

    public void printPerson(int index) {
        System.out.println(people[index]);
    }
}
