package oops;

public class javaClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student3 = new Student();

        Student student2 = new Student(12, 30, "Kunal");
        System.out.println( student1.roll + " " + student1.age +  " " +student1.name);
        System.out.println( student2.roll + " " + student2.age +  " " +student2.name);
        System.out.println( student3.roll + " " + student3.age +  " " +student3.name);

    }


}
class Student{
    int roll;
    int age;
    String name;

    // I can make a default constructor
    Student(){
        System.out.println("constructor called");
        roll = 5;
        age = 20;
        name = "Emad";

    }
    // parametrized constructor

    Student(int roll, int age, String name){
        this.roll = roll;
        this.age = age;
        this.name = name;

    }


}
