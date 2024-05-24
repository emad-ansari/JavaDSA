package oops.Innerclass;

public class AnonymousInnerClass {
    public void show(){
        System.out.println("Inside parent class ");

    }

    
}
// A class having no name and have defined inside another class is known as Anonymous Inner class 
class DemonstrateInnerClass{

    // Below is the example of inner class 
    public static void main(String[] args){
        AnonymousInnerClass obj = new AnonymousInnerClass() {
            // if we want to change the behaviour of show method defined inside AnonymousInner class so we need to extend this
            // but if don't want to extend then we use this concept of Annonymous Inner class
            // and we provide a different behaviour of show method inside this block
            public void show(){
                System.out.println("inside annonymous inner class ");
            }   
        };
    
        obj.show();

    }
}
