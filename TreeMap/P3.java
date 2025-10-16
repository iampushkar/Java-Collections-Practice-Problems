package MPushkar.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class P3 {
    public static void main(String[] args) {
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
