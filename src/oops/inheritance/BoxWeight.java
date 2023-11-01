package oops.inheritance;

public class BoxWeight  extends Box{
    double weight;

    BoxWeight(double l){
        this.weight = -1;
        this.l = l;
    }

    BoxWeight(double l, double w, double h, double weight) {
//        super(l, w, h);  // it basically calls the parent class constructor
        this.l = l;
        this.w = w;
        this.h = h;
        this.weight =  weight;
    }
    BoxWeight(BoxWeight other){
//        super(other.l, other.w, other.h);
        this.weight = other.weight;

    }
    @Override
    void are(){
        System.out.println("I am BoxWeight class function");

    }

//    @Override
    // static method can not be  Overridden , If we will put @Override annotation it will give error
    static void greeting(String name){
        System.out.println("Hello in child " + " " + name);

    }
}

