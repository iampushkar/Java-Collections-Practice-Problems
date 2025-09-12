package MPushkar.StackPrblm;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackD<T> {

    Deque<Integer> deque= new ArrayDeque<>();
    public boolean isEmpty(){
       return  deque.isEmpty();

    }

    public void push(int n){
        deque.addLast(n);
    }

    public void pop(){
        deque.removeLast();
    }

    public int peek(){
        if(deque.isEmpty())
            return -1;

     return  deque.peekLast();
    }
    public int size(){
        return deque.size();
    }




}
