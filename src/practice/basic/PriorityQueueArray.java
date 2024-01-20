package practice.basic;

public class PriorityQueueArray {

    private int[] arr;
    private int size;
    private int capacity;

    public PriorityQueueArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void enqueue(int element) {
        if (size == capacity) {
            System.out.println("Priority Queue is full. Cannot enqueue more elements.");
            return;
        }

        arr[size] = element;
        size++;
        int currentIndex = size - 1;
        int parentIndex = (currentIndex - 1) / 2;

        while (currentIndex > 0 && arr[currentIndex] > arr[parentIndex]) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = (currentIndex - 1) / 2;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue is empty. Cannot dequeue.");
            return -1; 
        }

        int root = arr[0];
        arr[0] = arr[size - 1];
        size--;
        
        heapify(0);

        return root;
    }

    private void heapify(int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < size && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueArray priorityQueue = new PriorityQueueArray(5);

        priorityQueue.enqueue(30);
        priorityQueue.enqueue(20);
        priorityQueue.enqueue(40);
        priorityQueue.enqueue(10);
        priorityQueue.enqueue(25);

        priorityQueue.display();

        System.out.println("Dequeue operation. Removed element: " + priorityQueue.dequeue());

        priorityQueue.display();
    }
}
