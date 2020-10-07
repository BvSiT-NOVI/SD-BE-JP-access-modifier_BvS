package nl.novi.javaprogrammeren.four.hidden;

import java.util.ArrayList;
import java.util.List;

public class PrisonCell {
    private String name;
    private List<Inhabitant> inhabitantList;

    public PrisonCell(String name) {
        this.name = name;
        this.inhabitantList = new ArrayList<>();
    }

    public PrisonCell(String cellName,String... names){
        this(cellName);
        for (String name:names){
            addInhabitant(name);
        }
    }

    public boolean addInhabitant(String nameInhabitant){
        if (!existsInListInhabitants(nameInhabitant)) {
            inhabitantList.add(new Inhabitant(nameInhabitant));
            return true;
        }
        return false;
    }

    private boolean existsInListInhabitants(String nameInhabitant){
        for (Inhabitant inh: inhabitantList){
            if (inh.getName().equalsIgnoreCase(nameInhabitant)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cell name: ").append(name);
        sb.append("\n\rNum of inhabitants: ").append(inhabitantList.size());
        if (inhabitantList.size()>0){
            String plural = inhabitantList.size()==1?"":"s";
            sb.append("\n\rName").append(plural)
                .append(" inhabitant").append(plural).append(" : ");
            for (Inhabitant inhabitant:inhabitantList){
                sb.append("\n\r").append(inhabitant.getName());
            }
        }
        return sb.toString();
    }
}
