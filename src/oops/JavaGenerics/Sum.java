package oops.JavaGenerics;

public class Sum<T extends Integer> {
    private T firstValue;
    private T secondValue;

    public Sum(T firstValuevalue, T secondValue){
        this.firstValue = firstValuevalue;
        this.secondValue =secondValue;
    }

    public  Integer calculateSum(T firstValue , T secondValue){
        return firstValue + secondValue;
    }    
}
