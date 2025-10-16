package MPushkar.PriorityQueue;

public class P6 {
    public static void main(String[] args) {
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
