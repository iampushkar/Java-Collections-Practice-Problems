package MPushkar.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P8 {
    public static void main(String[] args) {


    Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
    List<Integer> list= Arrays.asList(b);

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    // Count frequency of each element
    for (int num : list) {
         frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    // Print the frequencies
    System.out.println("Element frequencies:");
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
    {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    }
}