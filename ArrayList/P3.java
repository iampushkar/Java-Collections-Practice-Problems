package MPushkar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
        List<Integer> list= Arrays.asList(b);
        List<Integer> uniqueEle = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!uniqueEle.contains(list.get(i)))
                uniqueEle.add(list.get(i));
        }
        System.out.println("Unique Elements"+uniqueEle);

    }
}
