package practice;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.insertLast(10);
//        list.insertLast(20);
//        list.insertLast(30);
//        list.insertLast(40);
//        list.insert(2, 70);
//        list.display();
//        System.out.println();
//        list.deleteByKey(10);
        System.out.println(list.get(0));
        list.display();
    }
}
