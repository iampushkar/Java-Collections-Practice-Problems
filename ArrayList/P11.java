package MPushkar.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P11 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 5, 7, 9));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 5, 7, 11));

        // Put sets into a list for easier handling
        List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);

        if (sets.isEmpty()) {
            System.out.println("No sets provided.");
            return;
        }

        // Start with the first set
        Set<Integer> intersection = new HashSet<>(sets.get(0));

        // Retain only common elements with each subsequent set
        for (int i = 1; i < sets.size(); i++) {
            intersection.retainAll(sets.get(i));
        }

        // Print result
        System.out.println("Intersection of all sets: " + intersection);
    }
}
