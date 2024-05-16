### TreeSet

1. [Create a LinkedList and perform various operations like add, remove, and iterate over it.](#problem-1)
2. [Implement a Queue using the LinkedList class.](#problem-2)
3. [Implement a Stack using the LinkedList class.](#problem-3)
4. [Write a program to check if two LinkedLists are equal.](#problem-4)

### Problem 1
```java
public class Problem1 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);

        linkedList.remove();

        for(Integer a : linkedList){
            System.out.println(a);
        }


    }
}
```
### Problem 2
```java

public class Problem2 {
//    1. [Implement a Queue using the LinkedList class..

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);

        while (!linkedList.isEmpty()){
            linkedList.remove();
            System.out.println(linkedList);
        }

    }
}

```
### Problem-3
```java

public class Problem3 {
//    Implement a Stack using the LinkedList class...

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);

        while (!linkedList.isEmpty()){
            linkedList.removeLast();
            System.out.println(linkedList);
        }

    }
}

```
### Problem-4
```java

```