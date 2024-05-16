### HashMap

1. [Create a HashMap to store the mappings of country names to their capitals.](#problem-1)

### Problem 1
```java
public class Problem1 {
//    Create a HashMap to store the mappings of country names to their capitals.

    public static void main(String[] args) {

        HashMap<String ,String> map = new HashMap<>();

        map.put("India","Delhi");
        map.put("UK","London");
        map.put("USA","Washington");
        map.put("Banladesh","Dhaka");

        System.out.println(map);

    }
}
```
