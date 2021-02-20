package advanced.collections;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String > countriesAndCities = new HashMap<>();
        countriesAndCities.put("Poland", "Warsaw");
        countriesAndCities.put("Lithuaia", "Vilnius");
        countriesAndCities.put("Latvia", "Ryga");

        for (Map.Entry<String, String> entry : countriesAndCities.entrySet()){
            String key = entry.getKey();
            String value1 = entry.getValue();
            String value2 = countriesAndCities.get(key);

            System.out.println("Key:" + key );
            System.out.println("Value from getValue():" + value1);
            System.out.println("Value from get (key):" + value2);
        }
    }
}
