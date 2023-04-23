import java.util.Hashtable;
import java.util.Map;


public class HashTabless {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("meesalai", 23);
        hashtable.put("jaffna", 34);
        hashtable.put("colombo", 89);
        int melalaicode = hashtable.get("meesalai");
        System.out.println(melalaicode);
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            String location = entry.getKey();
            // it is synchronized and thus thread-safe.
            int Name = entry.getValue();
            System.out.println(Name + " is " + location + " codse ");

        }
    }
}
