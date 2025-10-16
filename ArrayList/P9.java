package MPushkar.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
        List<Integer> list= Arrays.asList(b);

        Collections.sort(list);
        System.out.println("Enter the smallest element");
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        if (k <= 0 || k > list.size()) {
            System.out.println("Invalid value of k.");
            return;
        }
        System.out.println("Kth Smallest Element: "+list.get(k-1));
    }
}
