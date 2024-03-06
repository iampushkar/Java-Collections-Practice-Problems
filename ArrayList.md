### ArrayList

1. [Write a program to sort an ArrayList of Strings alphabetically.](#problem-1)
2. [Write a program to find the maximum element from an ArrayList of Integers.](#problem-2)
3. [Write a program to remove all duplicate elements from an ArrayList.](#problem-3)
4. [Create a LinkedList and perform various operations like add, remove, and iterate over it.](#problem-4)
5. [Write a program to find the intersection of two ArrayLists.](#problem-5)
6. [Write a program to shuffle the elements of an ArrayList.](#problem-6)
7. [Write a program to find the second-largest element in an ArrayList of Integers.](#problem-7)
8. [Write a program to find the frequency of each element in an ArrayList.](#problem-8)
9. [Write a program to find the kth smallest element in an ArrayList.](#problem-9)
10. [Write a program to merge two ArrayLists into a single ArrayList.](#problem-10)
11. [Write a program to find the intersection of multiple Sets.](#problem-11)
12. [Write a program to check if two LinkedLists are equal.](#problem-12)
13. [Write a program to check if a HashSet is a subset of another HashSet.](#problem-13)

### Problem 1
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("orange");

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
```

### Problem 2
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

        int max = Collections.max(list);

        System.out.println("Maximum element: " + max);
    }
}
```

### Problem 3
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(10);
        list.add(20);

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("ArrayList after removing duplicates: " + list);
    }
}
```

### Problem 4
```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        List<Integer> linkedList = new LinkedList<>(list);

        System.out.println("LinkedList: " + linkedList);
    }
}
```

### Problem 5
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        list1.retainAll(list2);

        System.out.println("Intersection of two ArrayLists: " + list1);
    }
}
```

### Problem 6
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.shuffle(list);

        System.out.println("Shuffled ArrayList: " + list);
    }
}
```

### Problem 7
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Second largest element: " + list.get(1));
    }
}
```

### Problem 8
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
```

### Problem 9
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        Collections.sort(list);

        int k = 2;
        System.out.println(k + "th smallest element: " + list.get(k - 1));
    }
}
```

### Problem 10
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);

        System.out.println("Merged ArrayList: " + list1);
    }
}
```

### Problem 11
```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list2);

        System.out.println("Intersection of multiple ArrayLists: " + intersection);
    }
}
```

### Problem 12
```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        boolean isEqual = list1.equals(list2);

        System.out.println("Are the LinkedLists equal? " + isEqual);
    }
}
```

### Problem 13
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean isSubset = set1.containsAll(set2);

        System.out.println("Is HashSet 1 a subset of HashSet 2? " + isSubset);
    }
}
```
