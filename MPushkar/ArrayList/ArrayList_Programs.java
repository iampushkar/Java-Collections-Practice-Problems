package MPushkar.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayList_Programs  {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("jay");
        list.add("preethi");
        list.add("Amit");
        list.add("ox");
        Collections.shuffle(list);//P6

        Integer[] b= new Integer[]{11,2,0,4,5,6,7,10,11,2};
        List<Integer> list1= Arrays.asList(b);
        System.out.print(P2(list1));
        System.out.print(P3(list1));
        P5();

        StateCapitals();
   //     Collections.sort(list);


    }
    public static int P2(List<Integer> list){
        Integer max_val= Integer.MIN_VALUE;
        for(int ele:list){
            max_val= Integer.max(max_val,ele);
        }
        return max_val;

    }
    public static List<Integer> P3(List<Integer> list){
        List<Integer> uniqueEle = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!uniqueEle.contains(list.get(i)))
               uniqueEle.add(list.get(i));
        }
        return uniqueEle;

    }

    public static void P5(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        Set<Integer> intersection = new HashSet<>(list1);
        intersection.retainAll(list3);

        System.out.println("Intersection of multiple ArrayLists: " + intersection);


            list1.addAll(list3);
        System.out.println(list1);;

        Set<Character> alphabets= new HashSet<>();
        Character ele= 'b';
        boolean v=false;
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('e');
        alphabets.add('f');
        for(Character c: alphabets)
        {
            if(c.equals(ele)) {
                System.out.print("exists");
                v= true;
            }

        }
        if(!v)
            System.out.print("does not exists");
    }

    public static void StateCapitals(){
        Map<String,String> m= new HashMap<>();
        m.put("France", "Paris");
        m.put("Germany","Berlin");
        m.put("India","New Delhi");
        m.put("Italy","Rome");
        m.put("Japan","Tokyo");
        m.put("Russia","Moscow");
        m.put("United Kingdom","London");
        m.put("United States","Washington D C");
    }
  public  static void Commonele(){
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.print(l1.retainAll(l2));


  }
}
