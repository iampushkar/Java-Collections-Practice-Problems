### Queue

1. [Implement a Queue using the LinkedList class.](#problem-1)
2. [Implement a priority queue using a custom comparator.](#problem-2)
3. [Implement a Queue using the PriorityQueue class.](#problem-3)
4.   [Implement a Queue using the ArrayDeque class.](#problem-4)
5.   [Implement a Queue using the PriorityQueue class with a custom comparator.](#problem-5)

### Problem 1
```java
public class Problem1 {
//    Implement a Queue using the LinkedList class.

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue.peek()); // 3
        System.out.println(queue.poll()); // 3

        System.out.println(queue); // [4,5]
    }
}
```
### Problem 2
```java

public class Problem2 {

//    Implement a priority queue using a custom comparator.


    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }
                else if(o1<o2)
                {
                    return 1;
                }
                return 0;
            }
        });

        queue.add(400);
        queue.add(8);
        queue.add(32);
        queue.add(11);

        System.out.println(queue.peek()); // 400

        System.out.println(queue.poll()); // 400
        System.out.println(queue.poll()); // 32

        System.out.println(queue);
    }
}


```
### Problem 3
```java
class Sample{
    int element;
    int index;

    Sample(int a,int b) {
        this.element = a;
        this.index = b;
    }

    @Override
    public String toString() {
        return Integer.toString(element);
    }
}

public class Problem3 {

    //Implement a Queue using the PriorityQueue class.
    public static void main(String[] args) {

        Queue<Sample> queue = new PriorityQueue<>(new Comparator<Sample>() {
            @Override
            public int compare(Sample o1, Sample o2) {
                return o1.index>o2.index ? -1:1;
            }
        });

        int k=0;
        queue.offer(new Sample(12,k++));
        queue.offer(new Sample(13,k++));
        queue.offer(new Sample(2,k++));
        queue.offer(new Sample(5,k++));

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}

```
### Problem-4
```java
public class Problem2 {

//    Implement a Queue using the ArrayDeque class.


    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.peekFirst()); // 1
        System.out.println(queue.pollFirst()); // 1




    }
}


```
### Problem-5
```java



```