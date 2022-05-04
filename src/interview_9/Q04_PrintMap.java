package interview_9;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_PrintMap {

    public static void main(String[] args) {
 /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */
        Map<Integer, String > map =new LinkedHashMap<>();

        map.put(10, "Java");
        map.put(20, "PHP");
        map.put(2, "Python");
        map.put(57, "C++");
        map.put(89, "C#");
        map.put(40, "Javascript");

        System.out.println(" Map : " + map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }




    }
}
