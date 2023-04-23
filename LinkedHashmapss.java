import java.util.LinkedHashMap;

public class LinkedHashmapss {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> astro=new LinkedHashMap<String,Integer>();
        astro.put("japan", 2000);
        astro.put("nehernald", 444);
        astro.put("Usa", 11);
        astro.put("london", 44);
        for(String key:astro.keySet()){
            System.out.println(key+":"+astro.get(key));
/*
 * LinkedHashMap, they will be returned in the same order in which they were inserted.
 */
        }
    }
}
