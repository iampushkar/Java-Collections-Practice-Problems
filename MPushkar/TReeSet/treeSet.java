package MPushkar.TReeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Person> userData= new TreeSet<>();

        userData.add(new Person("Alice",34));
        userData.add(new Person("bob",12));
        userData.add(new Person("fancy",1));
        userData.add(new Person("Karthik",3));
        userData.add(new Person("vernice",2));
        userData.add(new Person("pepi",16));

        System.out.println("Userdata sorted based on ranking");
        for(Person p:userData)
        System.out.println(p.getName()+" , "+p.getRank());
        useComparator();

    }

    public static  void useComparator(){
       Set<StringBuffer> ts=new TreeSet<StringBuffer>(new Comparator<StringBuffer>() {
           @Override
           public int compare(StringBuffer o1, StringBuffer o2) {
               return o1.toString().compareTo(o2.toString());
           }
       });
       ts.add(new StringBuffer("welcome"));
       ts.add(new StringBuffer("jam"));
       ts.add(new StringBuffer("ruth"));
       ts.add(new StringBuffer("ether"));
        System.out.println(ts);

    }
}
