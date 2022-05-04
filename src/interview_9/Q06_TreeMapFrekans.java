package interview_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q06_TreeMapFrekans {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
// siralam yaptigi icin en yavasi
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz...");
        String ifade = scan.nextLine().toLowerCase();



        frekans(ifade);

        Map<String, Integer> map = frekans2(ifade); //2.yol array sinifindan faydalanarak
        System.out.println("map = " + map);

    }

    private static Map<String, Integer> frekans2(String cumle) {
        String harfler [] = cumle.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String each: harfler
        ) {
            if(!map.containsKey(each)){ //daha onceden map icinde bu harf yoksa
                map.put(each,1); //sayisi 1 olsun
            }else map.put(each,map.get(each)+1); ////daha onceden map icinde bu harf varsa sayisini 1 arttir
        }
        return map;
    }


    private static void frekans(String ifade) {

        TreeMap<Character, Integer> frMap=new TreeMap<>(); // contanier

        for (int i = 0; i < ifade.length(); i++) {
            if(frMap.containsKey(ifade.charAt(i))) { // cumleyi karakterlere boler
                frMap.replace(ifade.charAt(i), frMap.get(ifade.charAt(i))+1);
                //karakterleri saydirmada ayni karakterden varsa sayisini 1 arttirarak gunceller
            }else {
                frMap.put(ifade.charAt(i),1);//frMap icine oncden bu karakter yoksa o zman bu satir calisir
            }
        }
        System.out.println(frMap);


    }
}
