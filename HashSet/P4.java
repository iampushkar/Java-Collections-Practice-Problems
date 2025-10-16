package MPushkar.HashSet;

import java.util.ArrayList;

public class P4 {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.print(l1.retainAll(l2));
    }
}
