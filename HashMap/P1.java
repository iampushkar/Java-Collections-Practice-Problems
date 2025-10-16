package MPushkar.HashMap;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        Map<String,String> CountryCaptialMap= new HashMap<String,String>();
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
}
