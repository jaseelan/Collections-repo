import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treemaps = new TreeMap<String, Integer>();
        treemaps.put("jaseelan", 23);
        treemaps.put("Astro", 343);
        treemaps.put("suganthan", 22);
        int jaseelanAge = treemaps.get("jaseelan");
        System.out.println("jaseelan age is:" + jaseelanAge);

        for (Map.Entry<String, Integer> astro : treemaps.entrySet()) {
            String name = astro.getKey();
            int age = astro.getValue();
            System.out.println(name + "is" + age + "years old");
            /*
             * which is a self-balancing binary search tree. The TreeMap class maintains the keys in a 
             * sorted order and provides efficient retrieval and insertion of key-value pairs.
             */

        }
    }
}
