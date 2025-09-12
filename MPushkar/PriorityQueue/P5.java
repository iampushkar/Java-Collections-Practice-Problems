package MPushkar.PriorityQueue;

import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
//        Queue<String> que= new Queue();
//        System.out.println();
//        que.offer("Alice");
//        que.offer("John");
//        que.offer("catherine");
//        System.out.println( "removed element"+que.remove());
//        System.out.println("size of queue"+que.size());
//        System.out.println(que.isEmpty());
//        System.out.println(que.peek());

        Stack<String> st= new Stack<>();
        st.push("Versase");
        st.push("Spade");
        st.push("jack");
        st.push("spring");
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }


}
