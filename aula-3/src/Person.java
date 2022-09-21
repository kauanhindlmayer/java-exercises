public class Person {
    String name;
    String lastName;
    int age;
    String cpf;

    public Person(String name, String lastName, int age, String cpf) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cpf = cpf;
    }

    void makeBirthday() {
        System.out.println(this.name + " " + this.lastName + " is doing birthday!");
    }
}
