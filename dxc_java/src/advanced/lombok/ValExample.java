package advanced.lombok;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lombok.val;

public class ValExample {
  @SuppressWarnings("unchecked")
public String example() {
    val example = (val) new ArrayList<String>();
    ((ArrayList<String>) example).add("Hello, World!");
    String foo = ((ArrayList<String>) example).get(0);
    return foo.toLowerCase();
  }
  
  @SuppressWarnings("unchecked")
public void example2() {
    val map = (val) new HashMap<Integer, String>();
    ((Map<Integer,String>) map).put(0, "zero");
    ((Map<Integer,String>) map).put(5, "five");
    for (Entry<Integer, String> entry : ((HashMap<Integer, String>) map).entrySet()) {
      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
    }
  }
}