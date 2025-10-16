package MPushkar.PriorityQueue;

import java.util.Comparator;

public class StackPQ implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getPriority(),o1.getPriority());
    }
}
