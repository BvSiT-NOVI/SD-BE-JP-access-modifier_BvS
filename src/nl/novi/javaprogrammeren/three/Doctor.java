package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Human;

public class Doctor extends Human {
    public Doctor(String sofiNumber) {
        super(sofiNumber);
    }

    public String getSofiNumber(){
        return super.getSofiNumber();//BvS: Als je super weg laat: error, blijkbaar in oneindige lus oid
    }

}
