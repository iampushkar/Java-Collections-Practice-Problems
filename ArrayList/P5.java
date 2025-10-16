package MPushkar.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list3);

        System.out.println("Intersection of multiple ArrayLists: " + intersection);
    }
}
