package MPushkar.HashMap;

import java.security.KeyStore;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        CountryCapitalMap();
        employee();
        CityNames();
        productPrices();
        employeeIDDepartment();
    }

    public static void CountryCapitalMap(){
        Map<String,String>  CountryCaptialMap= new HashMap<String,String>();
        CountryCaptialMap.put("AUSTRALIA","CANBERRA");
        CountryCaptialMap.put("AUSTRIA","VIENNA");
        CountryCaptialMap.put("ANGOLA","LUANDA");
        CountryCaptialMap.put("ANDORRA","ANDORRA LA VELLA\n");
        CountryCaptialMap.put("ALGERIA","ALGIERS");
        CountryCaptialMap.put("BELGIUM","BRUSSELS");
        CountryCaptialMap.put("BHUTAN","THIMPHU");
        CountryCaptialMap.put("BRAZIL","BRASILIA");
        CountryCaptialMap.put("BULGARIA","SOFIA");
       for(Map.Entry<String,String> entry:CountryCaptialMap.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }

    public static void employee(){
        Map<Integer,String> employee = new HashMap<Integer,String>();
        employee.put(101,"Alice");
        employee.put(102,"Bob");
        employee.put(103,"vernice");
        employee.put(104,"piece");



    }
    public static void CityNames(){
        Map<String,Integer> cityPopulation= new HashMap<String,Integer>();
        cityPopulation.put("New York", 8419600);
        cityPopulation.put("Los Angeles", 3980400);
        cityPopulation.put("Chicago", 2716000);
        cityPopulation.put("Houston", 2328000);
        for(Map.Entry<String,Integer> entry:cityPopulation.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }



    public static void productPrices(){
        Map<String,Double> productPrices= new HashMap<String, Double>();
        productPrices.put("Laptop", 1000.99);
        productPrices.put("Smartphone", 699.50);
        productPrices.put("Headphones", 199.99);
        productPrices.put("Keyboard", 89.99);
        for (var entry : productPrices.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: $" + entry.getValue());
        }
    }


    public  static void employeeIDDepartment(){
        Map<Integer,String> employeeDepartment= new HashMap<Integer, String>();
        employeeDepartment.put(101,"CSE");
        employeeDepartment.put(102,"ECE");
        employeeDepartment.put(103,"EEE");
        employeeDepartment.put(104,"CSE");
        employeeDepartment.put(105,"IT");
        for(Map.Entry<Integer,String> entry:employeeDepartment.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
















}
