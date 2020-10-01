package nl.novi.javaprogrammeren.one;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //BvS Option 1: maak getName public
    public String getName() {
        return name;
    }

}
