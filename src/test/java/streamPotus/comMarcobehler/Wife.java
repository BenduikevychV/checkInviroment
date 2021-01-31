package streamPotus.comMarcobehler;

import java.util.List;

public class Wife {

    private String name;
    private List<Child> child;

    public Wife(String name, List<Child> child) {
        this.name = name;
        this.child = child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}
