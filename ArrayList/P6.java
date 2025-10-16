package MPushkar.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jay");
        list.add("preethi");
        list.add("Amit");
        list.add("ox");
        Collections.shuffle(list);
    }
}
