public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Person person = new Person("Kauan", "Hindlmayer", 17, "000.000.000-00");
        person.makeBirthday();

        // Exercise 2
        Door door1 = new Door(true, "Blue", 1, 2, 1);
        Door door2 = new Door(true, "Blue", 1, 2, 1);
        Door door3 = new Door(true, "Blue", 1, 2, 1);
        House myHouse = new House("Blue", door1, door2, door3);
        int result = myHouse.howManyDoorsAreOpen();
        System.out.println(result);

        // Exercise 3
        Calculator myCalculator = new Calculator();
        myCalculator.sum(3, 4);

        // Exercise 4
        Employee employee = new Employee("Kauan", "Hindlmayer", 2000);
        System.out.println(employee);

        // Exercise 5
        Date date = new Date(23, 10, 2004);
        date.advanceDay();
        String otherResult = date.formatDate();
        System.out.println(otherResult);
    }
}
