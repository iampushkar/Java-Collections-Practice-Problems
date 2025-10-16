package MPushkar.StackPrblm;

import java.util.Stack;

public class P1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        System.out.print(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


    }

}
