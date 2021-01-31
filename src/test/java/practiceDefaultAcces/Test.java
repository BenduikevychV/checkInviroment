package practiceDefaultAcces;

import practiceDefaultAcces.Practice.One;

public class Test extends One {

    public  void printName(){
        getName();

    }
    public static void main(String[] args) {
//        One o = new One();
        Test o = new Test();
        o.setAge(35);
        int newAge = o.getAge();
        System.out.println(newAge);
       o.getAge();
      Test t = new Test();
      t.printName();
      t.getName();

    }
// if constructor has default access modifier we can NOT inherit that class and can NOT create the object in another package
    // if constructor has protected we can inherit in another package but can NOT create object of that class

}
