package oops;

import java.util.Arrays;

public class CustomArrayList {
    private int DEFAULT_CAPACITY = 10;
    private int size = 0;
    public int[] arr;
    public CustomArrayList(){

        arr = new int[DEFAULT_CAPACITY];
    }
    public void add(int number){
        if(isFull(arr)){
            // increase the size of arr and then add
            int[] temp = new int[2 * size];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size++] = number;
    }
    private boolean isFull(int[] arr){
        return size == arr.length;
    }
    public int get(int index){
        return arr[index];
    }
    public int size(){
        return size;
    }

    public void remove(int index){
        if (index > size){
            // means that there is no element at provided index to remove
            System.out.println("index does not exist");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    public String print(){
        return Arrays.toString(Arrays.copyOf(arr, size));
    }


    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.get(0);
//        list.size();
//        list.remove(0);
//
        CustomArrayList myList = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            myList.add( 2* i);
        }
        System.out.println("size before remove: " + myList.size());
        System.out.println(myList.print());
        myList.remove(5);
        System.out.println("size after remove: " + myList.size());
        System.out.println(myList.print());

//        System.out.println(myList.get(5));
    }
}
