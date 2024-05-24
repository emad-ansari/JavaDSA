package HigherOrderAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Job {
    // Each job has a unique-id,profit and deadline
    char id;
    int deadline, profit;

    // Constructors
    public Job() {}

    public Job(char id, int deadline, int profit)
    {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // Function to schedule the jobs take 2 arguments
    // arraylist and no of jobs to schedule
    void printJobScheduling(ArrayList<Job> arr, int t)
    {
        // Length of array
        int n = arr.size();

        // Sort all jobs according to decreasing order of
        // profit
        Collections.sort(arr,
                (a, b) -> b.profit - a.profit);

        // To keep track of free time slots
        boolean[] slot = new boolean[t];
        int totalProfit  = 0;
        // To store result (Sequence of jobs)
        char[] resultJob = new char[t];
        for (int i = 0; i < n; i++) {
            int deadLine = arr.get(i).deadline - 1;
            while (deadLine >= 0){
                if (!slot[deadLine]){
                    // pick the job
                    resultJob[deadLine] = arr.get(i).id;
                    // add total profit
                    totalProfit += arr.get(i).profit;
                    // make the slot as true
                    slot[deadLine] = true;
                    break;
                }
                deadLine--;
            }
        }
        // Print the sequence
        for (char jb : resultJob)
            System.out.print(jb + " ");
        System.out.println();
        System.out.println("Total profit is: " + totalProfit);
    }

    // Driver's code
    public static void main(String args[])
    {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 3, 35));
        arr.add(new Job('b', 4, 30));
        arr.add(new Job('c', 4, 25));
        arr.add(new Job('d', 2, 20));
        arr.add(new Job('e', 3, 15));
        arr.add(new Job('f', 1, 12));
        arr.add(new Job('g', 2, 5));


        System.out.println(
                "Following is maximum profit sequence of jobs");

        Job job = new Job();

        // Function call
        job.printJobScheduling(arr, 4);
    }
}
