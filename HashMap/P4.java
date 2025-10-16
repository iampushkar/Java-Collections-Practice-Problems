package MPushkar.HashMap;

import java.util.HashMap;
import java.util.Map;

public class P4 {
    public static void main(String[] args) {
        Map<String,Double> productPrices= new HashMap<String, Double>();
        productPrices.put("Laptop", 1000.99);
        productPrices.put("Smartphone", 699.50);
        productPrices.put("Headphones", 199.99);
        productPrices.put("Keyboard", 89.99);
        for (var entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: $" + entry.getValue());
        }
    }
}
