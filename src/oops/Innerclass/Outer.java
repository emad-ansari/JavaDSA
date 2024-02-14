package oops.Innerclass;
// example of Nested class
public class Outer {
    

    // exmaple of inner class
    class Inner {
        Inner() {
            System.out.println("this is private inner class");
        }
        void greeting() {
            System.out.println("non-static method inside inner class");
        }
        static void greet() {
            System.out.println("static method inside inner class");
        }
    }

    public Inner getInnerClass() {
        return new Inner();
    }


    public static void main(String[] args){
        // Outer.Inner obj = new Outer().new Inner();
        //   obj.greeting();
        Outer obj1 = new Outer();
        Inner obj2 = obj1.getInnerClass();
        
        obj2.greeting();
        Inner.greet();
    }       
}
