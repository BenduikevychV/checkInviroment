package practiceListStreamtoMap;

public class Student {
    private String name;
    private int age;
    private String phoneNumber;

   public Student(String name, int age, String phoneNumber){
       this.age = age;
       this.name = name;
       this.phoneNumber = phoneNumber;
   }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
