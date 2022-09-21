import entities.*;

public class Main {
    public static void main(String[] args) {

        Brand myBrand1 = new Brand();
        Brand myBrand2 = new Brand();

        Model myModel1 = new Model();
        Model myModel2 = new Model();
        Model myModel3 = new Model();
        Model myModel4 = new Model();

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        Car myCar4 = new Car();
        Car myCar5 = new Car();

        Person myPerson = new Person("Kauan", "0 0000-0000", "kauan@email.com");

        Agenda myAgenda = new Agenda();

        myAgenda.addPerson(myPerson);

        myAgenda.printAgenda();

        myAgenda.printPerson(0);
    }
}