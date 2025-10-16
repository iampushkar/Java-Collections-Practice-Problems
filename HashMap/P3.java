package MPushkar.HashMap;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {
        Map<String,Integer> cityPopulation= new HashMap<String,Integer>();
        cityPopulation.put("New York", 8419600);
        cityPopulation.put("Los Angeles", 3980400);
        cityPopulation.put("Chicago", 2716000);
        cityPopulation.put("Houston", 2328000);
        for(Map.Entry<String,Integer> entry:cityPopulation.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
