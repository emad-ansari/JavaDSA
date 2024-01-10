package oops.Innerclass;
// example of Nested class
public class Outer {
    private int age;

    Outer(int  DATA_OF_BIRTH) {
        this.age =  age;
    }
    private int returnAge(){
        return age;

    }


    // exmaple of inner class
    public class Inner {
        Inner() {
            System.out.println("this is inner class");
        }
        void greeting() {
            System.out.println("hello world");
        }

        
    }


    public static void main(String[] args){
        Outer.Inner obj = new Outer(10).new Inner();
        obj.greeting();
    }   


    
}
