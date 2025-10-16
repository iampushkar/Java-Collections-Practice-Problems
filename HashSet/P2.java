package MPushkar.HashSet;

import java.util.HashSet;
import java.util.Set;

public class P2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(10);
        if(!set.contains(5))
            System.out.println("element doesn't exist" );

        Set<Character> alphabets= new HashSet<>();
        Character ele= 'b';
        boolean v=false;
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('e');
        alphabets.add('f');
        for(Character c: alphabets)
        {
            if(c.equals(ele)) {
                System.out.print("exists");
                v= true;
            }

        }
        if(!v)
            System.out.print("does not exists");

    }

}
