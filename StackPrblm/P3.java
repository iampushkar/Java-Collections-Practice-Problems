package MPushkar.StackPrblm;

public class P3 {
    public static void main(String[] args) {
        StackD<Integer> stack = new StackD<>();

        stack.push(5);
       System.out.println( stack.peek());
        stack.pop();
       System.out.println(stack.peek());
       System.out.println(stack.isEmpty());
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }




    }
}
