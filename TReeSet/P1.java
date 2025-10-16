package MPushkar.TReeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class P1 {
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


    }

}
