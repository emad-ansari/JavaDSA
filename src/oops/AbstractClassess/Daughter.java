package oops.AbstractClassess;

public class Daughter extends Parent{
    Daughter(int age){
        this.age = age;
    }
    public void career(){
        System.out.println("I am a doctor");
    }
    protected void partner(){
        System.out.println("I love Captain America");
    }
}
