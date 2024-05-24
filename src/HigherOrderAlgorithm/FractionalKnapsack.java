package HigherOrderAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    // Class to define an item.
    static class Item {
        // Weight and Value of
        // an Item.
        int weight, value;
        // Value one can obtain by
        // taking a unit weight (1 Kg).
        double valuePerUnitWeight;

        // Constructor
        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;

            // Calculating the ratio.
            valuePerUnitWeight = (double) (value) / (weight);
        }
    }

    // Function to find the maximum
    // value that can be obtained.
    static double getMax(int[] weight, int[] value, int capacity) {
        // Finding the size of the array.
        int n = weight.length;

        // Making a new List array (say list)
        // of item type.
        List<Item> list = new ArrayList<>();

        // Filling elements in the list.
        for (int i = 0; i < n; i++) {
            list.add(new Item(weight[i], value[i]));
        }

        // Sorting the list in the decreasing
        // order of the value per unit weight ratio.
        Collections.sort(
                list,
                new Comparator<Item>() {

                    public int compare(Item i1, Item i2) {
                        if (i1.valuePerUnitWeight > i2.valuePerUnitWeight) return -1;
                        return 1;
                    }
                }
        );

        // Initializing answer with 0.
        double ans = 0;

        // Iterating over the list
        for (int i = 0; i < n; i++) {
            int wt = list.get(i).weight;
            int val = list.get(i).value;
            double valuePerUnitWeight = list.get(i).valuePerUnitWeight;
            // If we can take the whole item.
            if (capacity >= wt) {
                // Adding value of current item.
                ans += val;

                // Reducing capacity by wt.
                capacity -= wt;
            }
            // Otherwise we can take a fraction.
            else {
                // Adding the value of the part that we can take.
                ans += valuePerUnitWeight * capacity;

                // Now we are left with no space, so
                // we will terminate the loop.
                capacity = 0;
                break;
            }
        }
        // Returning the answer
        return ans;
    }

    public static void main(String[] args) {
        // Defining the weights and values
        // of the item.
        int[] weight = { 10, 30, 20, 50 };
        int[] value = { 40, 30, 80, 70 };
        int capacity = 60;

        System.out.println(
                "Maximum value that" +
                        " can be obtained is " +
                        getMax(weight, value, capacity)
        );
    }
}
