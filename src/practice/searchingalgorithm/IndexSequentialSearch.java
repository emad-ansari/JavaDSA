package practice.searchingalgorithm;
import java.util.Scanner;


public class IndexSequentialSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Enter the range : ");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();


        System.err.println("Enter the value you want to search : ");
        int target = input.nextInt();

        if (indexSequential(arr, target, range) == -1) {
            System.out.println("Target not found");
        }
        else {
            System.out.println("Target found");
        }
    }

    public static int indexSequential(int[] arr, int target, int range) {

        int[] index = new int[arr.length];
        int indx = 0;
        int found = -1;

        for (int i = 0; i < index.length; i = i + range ) {
            index[indx++] = i;
        }

        if (index[indx - 1] != arr.length - 1){ 
            index[indx++] = arr.length - 1;
        }

        if (target < arr[index[0]] || target > arr[index[indx - 1]]){
            return found;
        }
        else {

            for (int i = 1; i < indx; i++) {
                if (target <= arr[index[i]]){

                    for (int j = index[i - 1]; j <= index[i]; j++) {
                        if (arr[j] == target){
                            found = j;
                            break;
                        }
                        
                    }
                    break;
                }   
            }
        }
        return found;
    }
    
}
