package gimal_prectice.chap07;

import java.util.Vector;
import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(7);
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);
        v.remove(1);
        int last = v.lastElement();

        System.out.println("벡터의 값:");
        for (Integer value : v) {
            System.out.println(value);
        }
        System.out.println("--------------");
        // 위, 아래의 for문은 같은 값을 출력함.
        for (int i = 0; i < v.size(); i++) {
            int integer = v.get(i);
            System.out.println(integer);
        }
        System.out.println("--------------");
        // 위의 두 개의 for문과 같은 값을 출력함.
        Iterator<Integer> iterator = v.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        System.out.println("마지막 요소: \n" + last);

        v.removeAllElements();
        for (Integer value : v) {
            System.out.println(value);
        }
        Vector<String> v2 = new Vector<String>(3);
        ArrayList<String> al = new ArrayList<String>(3);
    }
}
