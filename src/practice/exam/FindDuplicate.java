package practice.exam;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2, 5, 5, 6, 6, 7, 2, 6, 7, 7, 7, 7 };
        printDuplicate(arr);
        System.out.println();
        findDuplicate(arr);


    }
    static void printDuplicate(int[] arr){
        boolean[] Counted = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j] && !Counted[i]){
                    count++;
                    Counted[j] = true;
                }
            }
            if (count != 1){
                System.out.println(arr[i] +  " appears " + count + " times " );
            }
        }
    }


    static void findDuplicate(int[] arr){
        int max = arr[0];
        for (int num: arr){
            if (num > max){
                max = num;
            }
        }

        int[] num = new int[max + 1];

        for (int item: arr){
            num[item]++;
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 1){
                System.out.println(i +  " appears " + num[i] + " times " );
            }
        }

    }

}
