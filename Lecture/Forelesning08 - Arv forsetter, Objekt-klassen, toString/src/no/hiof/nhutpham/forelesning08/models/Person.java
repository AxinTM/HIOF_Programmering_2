package no.hiof.nhutpham.forelesning08.models;

// Person klasse definert på vanlig måte (innkapsling),
// med private variabler, public gettere og settere, og en
// konstruktør som setter variablene ved opprettelse.
public class Person {

    private String name;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "...";
    }

    public String getInfo() {
        return "Hello, my name is " + name + " " + lastName + " and i'm " + age + " year old.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}