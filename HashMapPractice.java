import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
        // check to see if key is in hashmap by using the containsKey method -- returns true or false
        System.out.println(userMap.containsKey("wwizard@codingdojo.com"));
        // check to see if value is in hashmap by using the containsValue method -- returns true or false
        System.out.println(userMap.containsValue("Sam Samurai"));
        // replace key/value pair with specified value by using the replace method -- returns true or false and if true changes value to specified value but the key/value pair must exist
        System.out.println(userMap.replace("wwizard@codingdojo.com", "Walter Wizard", "W Wizard"));
        // Test that replace worked on HashMap in line above
        System.out.println(userMap.containsValue("Walter Wizard"));  // returns false as it does not exist anymore
        System.out.println(userMap.containsValue("W Wizard"));  // returns true as it does exist now
        // check to see the number of key value pair in HashMap using size method
        System.out.println(userMap.size());
        System.out.println(userMap.values());
        // check to see if the HashMap is empty using isEmpty method -- returns true or false
        System.out.println(userMap.isEmpty());  // returns false because keys/value pairs exist in HashMap
        // use clear method to clear entire HashMap
        userMap.clear();
        // Test that clear method actually worked
        System.out.println(userMap.isEmpty()); // returns true because keys/value pairs were cleared in HashMap
        System.out.println(userMap.values());  // check that nothing exists -- returns empty array of values in HashMap
    }
}
// HashMap Documentation from Oracle - https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html 
// Map interface Documentation from Oracle -- https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html