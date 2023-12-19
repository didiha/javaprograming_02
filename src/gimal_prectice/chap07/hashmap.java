package gimal_prectice.chap07;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> Score = new HashMap<String, Integer>();

        Score.put("하채린", 1);
        Score.put("박서현", 2);
        Score.put("최수빈", 3);
        Score.put("허수진", 4);

        System.out.println("요소 개수:" + Score.size());
        Set<String> keys = Score.keySet();
        Iterator<String> it = keys.iterator();

        while(it.hasNext()) {
            String name = it.next();
            int score = Score.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
