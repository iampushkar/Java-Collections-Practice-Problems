package MPushkar.TreeMap;

import java.util.TreeMap;
import java.util.Map;

public class P123 {
    public static void main(String[] args) {
        TreeMapExample();
        BookTitles();
        wordFreq();
    }

    public static void TreeMapExample(){
        TreeMap<Integer, String> tmap
                = new TreeMap<Integer, String>();
        tmap.put(3,"catherine");
        tmap.put(1,"heather");
        tmap.put(4,"yash");
        tmap.put(2,"geniue");
        tmap.put(10,"feaster");

        for(Map.Entry<Integer,String > entry:tmap.entrySet()){
            System.out.println(entry.getKey() +"  "+entry.getValue());
        }
    }
    public static void BookTitles(){
        TreeMap<String, String> book
                = new TreeMap<String, String>();
        book.put("Mark Twain","The Adventures of Tom Sawyer");
        book.put("George Orwell","Animal Farm");
        book.put("Leo Tolstoy","Anna Karenina");
        book.put("Jane Austen","Pride and Prejudice");
        System.out.println("Executed");
       for( Map.Entry<String,String> entry:book.entrySet()){
           System.out.println(entry.getKey()+" --"+entry.getValue());
       }
    }
    //TC :
    // Sc:
    public static void wordFreq(){
       StringBuffer text=new StringBuffer("This is a sample text. This text has some words. Some words appear more than once.");
       String[] s=text.toString().toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
       TreeMap<String, Integer> words
                = new TreeMap<String, Integer>();
       for(String st:s)
       {
           if(words.containsKey(st))
               words.put(st,words.get(st)+1);
           else
               words.put(st,1);
       }
        for( Map.Entry<String,Integer> wordsfreq:words.entrySet()){
            System.out.println(wordsfreq.getKey()+" --"+wordsfreq.getValue());
        }
        System.out.println("Executed");
    }




}
