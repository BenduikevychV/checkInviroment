public class Employe {
   int age;
   String name;
    Employe(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
