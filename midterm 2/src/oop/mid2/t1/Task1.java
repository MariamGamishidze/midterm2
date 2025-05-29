package oop.mid2.t1;

import java.util.List;
import java.util.ArrayList;

//This program demonstrates an algorithm for processing two input lists
//Initializes two input arrays (list1 with integers, list2 with strings)
// Applies the (2n-1) algorithm to generate indices from list1
//Uses these indices to extract elements from list2 into list3
//Applies the removal pattern to list3
// Outputs the final processed result


public class Task1 {
    public static void main(String[] args) {
        int[] list1 = {6, 9, 9, 5, 3, 7, 6, 2, 4, 7, 6, 5, 9};
        // For each element in list1, the program calculates an index using the formula (2n-1).

        String[] list2 = {
                "fykh", "kVCyE", "Cp3", "AJJ", "Xp4", "W1H", "HTc", "MS6oq",
                "NJiRM", "nmD", "IEoEj", "Khcns", "slGO", "V8O4", "zfxQ",
                "YBy0", "qcXq", "DOd2"
        };

        //this is where main algorithm is working.
        List<String> list3 = new ArrayList<>();
        for (int n : list1) {
            int index = 2 * n - 1;
            if (index >= 0 && index < list2.length) {
                list3.add(list2[index]);
            }
        }

        // Apply removal pattern to get final result
        List<String> finalList3 = applyRemovalPattern(list3);

        System.out.println(finalList3);
    }

    public static List<String> applyRemovalPattern(List<String> list) {
        List<String> result = new ArrayList<>(list);

        // Removes first element
        if (!result.isEmpty()) {
            result.remove(0);
        }

       // Removes every second element
        int i = 1;
        while (i < result.size()) {
            result.remove(i);
            i++;  // Move to next position which becomes the new element
        }

        return result;
    }
}