package practice.exam;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3, 1, 2, 3);

    }

    static void TOH(int n, int A, int B, int C){
        if (n > 0){
            TOH(n - 1, A, C, B);
            System.out.println("Move a disc from " + A + " to " + C);
            TOH(n - 1, B, A, C);
        }
    }
}
