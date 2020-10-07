package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {
        PrisonCell c1=new PrisonCell("101");
        c1.addInhabitant("Piet de Kraker");
        c1.addInhabitant("Jan Zware Jongen");

        PrisonCell c2=new PrisonCell("102");
        c2.addInhabitant("Ron de Raper");
        c2.addInhabitant("Dean de Dealer");

        PrisonCell c3=new PrisonCell("103");
        c3.addInhabitant("Kees Killer");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        PrisonCell c4=new PrisonCell("103","Jan","Kees");
        System.out.println(c4.toString());




    }
}
