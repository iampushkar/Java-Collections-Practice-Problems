package MPushkar.PriorityQueue;

import java.util.Comparator;

public class QueuePQ implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        //sort by descending order
        return Integer.compare(o1.getPriority(),o2.getPriority());
    }


}





