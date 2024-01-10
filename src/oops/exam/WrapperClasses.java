package oops.exam;

public class WrapperClasses {

    protected int a;
    protected int b;

    void swap(Integer a, Integer b){
        
        Integer temp = a;
        this.a = b;
        this.b = temp;     
    }
    public void printValue(){
        System.out.println("Value of a is :" + a);
        System.out.println("value of b is : " + b);
    }
}
