package oops.AbstractClassess;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(12);
        System.out.println(son.age);
        son.career();
        Daughter daughter = new Daughter(20);
        daughter.partner();


//        Parent parent = new Parent();  Abstract classes can not be instantiated.

    }
}
