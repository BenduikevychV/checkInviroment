package streamPotus.comMarcobehler;

public class Child {

    private String name;
    private int age;

    public Child(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
