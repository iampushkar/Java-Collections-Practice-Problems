package MPushkar.TReeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class P2 {
    public static void main(String[] args) {
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
