package TwoInterfaceSameMethods;


import streamsDemo1.superClassCheking;

public  class subClassChecking extends superClassCheking{

    superClassCheking s = new superClassCheking();

    public static void main(String[] args) {
        subClassChecking chek = new subClassChecking();
        subClassChecking1 chek1 = new subClassChecking1();
chek.name = "Volodymyr";
        chek1.number ="one";
//        chek.name = "Volodymyr";
        chek1.number ="";
    }
    static class Hello{

    }

}
