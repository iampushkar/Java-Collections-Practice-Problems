### TreeSet

1. [Create a TreeSet and add elements to it. Then, print the elements in sorted order.](#problem-1)
2. [Create a TreeSet of custom objects and implement the Comparable interface for sorting.](#problem-2)

### Problem 1
```java
public class Problem1 {
    //Create a TreeSet and add elements to it. Then, print the elements in sorted order.

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(13);

        System.out.println(set);
        //[3, 5, 9, 13]

    }
}
```
### Problem 2
```java

class Employee implements Comparable<Employee>{
    int id;
    String name;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "[Name="+this.name+",Id="+this.id+"]";
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id>o.id)
        {
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class Problem2 {
    //Create a TreeSet of custom objects and implement the Comparable interface for sorting.


    public static void main(String[] args) {

        Set<Employee> set = new TreeSet<>();

        set.add( new Employee(0,"Animesh"));
        set.add(new Employee(1,"Ankit"));
        set.add(new Employee(2,"Ram"));
        set.add(new Employee(4,"Shyam"));
        set.add(new Employee(3,"Manish"));

        for(Employee e : set)
        {
            System.out.println(e);
        }
    }
}


```