package MPushkar.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class P10 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list1.addAll(list3);
        System.out.println(list1);;
    }
}
