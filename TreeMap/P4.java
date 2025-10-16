package MPushkar.TreeMap;

import java.util.Arrays;
import java.util.TreeMap;

public class P4 {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        studentMap.put(101,new Student("Alice",20,"CSE"));
        studentMap.put(102,new Student("bOB",27,"ECE"));
        studentMap.put(103,new Student("varnice",30,"IT"));

        for(Integer id: studentMap.keySet()){
            System.out.println("Id :" +id+ "\nStudent Details: \n" +studentMap.get(id).toString());
        }

    }

}
