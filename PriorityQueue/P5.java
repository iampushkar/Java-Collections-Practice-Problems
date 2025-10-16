package MPushkar.PriorityQueue;

import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        Queue<String> que= new Queue();
        System.out.println();
        que.offer("Alice");
        que.offer("John");
        que.offer("catherine");
        System.out.println( "removed element"+que.remove());
        System.out.println("size of queue"+que.size());
        System.out.println(que.isEmpty());
        System.out.println(que.peek());



    }


}
