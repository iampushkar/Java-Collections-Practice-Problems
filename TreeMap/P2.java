package MPushkar.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class P2 {
    public static void main(String[] args) {
        TreeMap<String, String> book = new TreeMap<String, String>();
        book.put("Mark Twain","The Adventures of Tom Sawyer");
        book.put("George Orwell","Animal Farm");
        book.put("Leo Tolstoy","Anna Karenina");
        book.put("Jane Austen","Pride and Prejudice");
        System.out.println("Executed");
        for( Map.Entry<String,String> entry:book.entrySet()){
            System.out.println(entry.getKey()+" --"+entry.getValue());
        }
    }
}
