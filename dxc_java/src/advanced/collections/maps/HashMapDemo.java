package advanced.collections.maps;

import java.util.HashMap;
import java.util.Map;

/*
 * A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 * two interfaces for implementing Map in java: Map and SortedMap
 * three classes: HashMap, LinkedHashMap, and TreeMap
 */


public class HashMapDemo {
	
	public static void main(String[] args) {
		
	Map<Integer,String> map = new HashMap<Integer, String>();
	
	map.put(1, "Rakesh");
	map.put(2, "Rakesh");
	map.put(3, "Rakesh");
	map.put(4, "Rakesh");
	map.put(5, "Rakesh");
	
    System.out.println("After invoking put() method ");  

	for (Map.Entry<Integer, String> m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	map.putIfAbsent(6, "Dama");
	
    System.out.println("After invoking putIfAbsent() method ");  
    
    for (Map.Entry<Integer, String> m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    hashMap.put(9, "maname");
    
    hashMap.putAll(map);
    
    System.out.println("After invoking putAll() method ");  
    for(Map.Entry<Integer, String> m:hashMap.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
        }  
    
    hashMap.remove(1);
    
    for(Map.Entry<Integer, String> m:hashMap.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
       }  
	
    
	
	}

}
