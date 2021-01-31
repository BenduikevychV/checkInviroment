package streamsDemo1;

public class Person {

    private String name;
    private int billions;

    public Person(String name, int billions){
        this.name = name;
        this.billions = billions;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getBillions() {
        return billions;
    }

    public void setBillions(int billions) {
        this.billions = billions;
    }
}
