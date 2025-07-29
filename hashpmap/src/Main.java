import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // hashmap

        Map<String,Integer> map = new HashMap<>();
        map.put("shoes",20);
        map.put("t-shirt",10);
        map.put("trousers",5);

        System.out.println(map);
        map = new TreeMap<>(map);
        System.out.println(map);
        for(String key: map.keySet()){
            System.out.println("Key: "+ key+" Value: $"+map.get(key));
        }
    }
}