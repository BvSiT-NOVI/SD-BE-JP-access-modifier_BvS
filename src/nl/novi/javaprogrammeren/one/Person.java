package nl.novi.javaprogrammeren.one;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //BvS Option 3: zonder acces modifier package private
    String getName() {
        return name;
    }

}
