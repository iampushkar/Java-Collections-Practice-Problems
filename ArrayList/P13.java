package MPushkar.ArrayList;

import java.util.HashSet;

public class P13 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

        // Check if set2 is a subset of set1
        if (set1.containsAll(set2)) {
            System.out.println("set2 is a subset of set1");
        } else {
            System.out.println("set2 is not a subset of set1");
        }
    }
}
