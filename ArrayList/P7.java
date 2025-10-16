package MPushkar.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P7 {
    public static void main(String[] args) {
        Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
        List<Integer> list= Arrays.asList(b);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
