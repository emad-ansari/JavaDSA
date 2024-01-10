package oops.exam;

public class PrimitivesToObjects {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        convertPrimitiveToObject(a, b);
        System.out.println(a);
        System.out.println(b);

    }
    static void convertPrimitiveToObject(Integer num1, Integer num2){
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
