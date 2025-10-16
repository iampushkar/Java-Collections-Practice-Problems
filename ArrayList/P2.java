package MPushkar.ArrayList;

import java.util.Arrays;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
        List<Integer> list= Arrays.asList(b);
        Integer max_val= Integer.MIN_VALUE;
        for(int ele:list){
            max_val= Integer.max(max_val,ele);
        }
        System.out.println("Maximum Element From an ArrayList" + max_val);

    }
}
