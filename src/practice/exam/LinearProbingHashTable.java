package practice.exam;
public class LinearProbingHashTable {
    private static final int TABLE_SIZE = 10;
    private int[] table;

    public LinearProbingHashTable() {
        table = new int[TABLE_SIZE];
        // Initialize all slots to -1 to indicate empty slots
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = -1;
        }
    }
    public void insert(int key) {
        int hash = hashFunction(key);

        while (table[hash] != -1) {
            // Linear probing: move to the next slot if the current slot is occupied
            hash = (hash + 1) % TABLE_SIZE;
        }
        // Insert the key into the found empty slot
        table[hash] = key;
    }
    public void display() { 
        System.out.print("Hash Table: ");
        for (int value : table) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private int hashFunction(int key) {
        return key % TABLE_SIZE;
    }

    public static void main(String[] args) {
        LinearProbingHashTable hashTable = new LinearProbingHashTable();
        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(35);
        hashTable.insert(45);
        hashTable.insert(55);
        hashTable.display();
    }
}
