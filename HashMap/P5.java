package MPushkar.HashMap;

import java.util.HashMap;
import java.util.Map;

public class P5 {
    public static void main(String[] args) {
        Map<Integer,String> employeeDepartment= new HashMap<Integer, String>();
        employeeDepartment.put(101,"CSE");
        employeeDepartment.put(102,"ECE");
        employeeDepartment.put(103,"EEE");
        employeeDepartment.put(104,"CSE");
        employeeDepartment.put(105,"IT");
        for(Map.Entry<Integer,String> entry:employeeDepartment.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
