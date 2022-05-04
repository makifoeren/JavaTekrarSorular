package interview_9;

import java.util.HashMap;
import java.util.Map;

public class Q05_PrintMap {

    public static void main(String[] args) {

 /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Bir");
        map.put(2, "Iki");
        map.put(3, "Uc");
        map.put(4, "Dort");
        map.put(5, "Bes");
        map.put(6, "Alti");

        for (HashMap.Entry<Integer, String> sayilar : map.entrySet()) {
            System.out.println(sayilar.getKey() + ", " + sayilar.getValue());

        }


    }
}
