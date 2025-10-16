package MPushkar.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P1 {

    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(10);
        for(Integer b:set){
            System.out.println(b);

        }
        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        set.forEach(st-> System.out.println(st));
        set.stream().forEach(System.out::println);


    }
}
