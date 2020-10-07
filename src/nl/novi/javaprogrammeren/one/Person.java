package nl.novi.javaprogrammeren.one;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //BvS Option 2: maak getName protected. Daardoor beschikbaar in package (en evt. in subclass, hier n.v.t.)
    protected String getName() {
        return name;
    }

}
