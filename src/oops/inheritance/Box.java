package oops.inheritance;

public class Box {
    double l;
    double w;
    double h;
    static int height;

    Box () {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }
    void are(){
        System.out.println("I am Box class function");

    }
    static void greeting(String name){
        System.out.println("Hello" + " " + name);

    }



}
