package MPushkar.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap
                = new TreeMap<Integer, String>();
        tmap.put(3,"catherine");
        tmap.put(1,"heather");
        tmap.put(4,"yash");
        tmap.put(2,"geniue");
        tmap.put(10,"feaster");

        for(Map.Entry<Integer,String > entry:tmap.entrySet()){
            System.out.println(entry.getKey() +"  "+entry.getValue());
        }
    }






}
