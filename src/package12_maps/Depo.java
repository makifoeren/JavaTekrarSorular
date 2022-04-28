package package12_maps;

import java.util.HashMap;
import java.util.Map;

public class Depo {


    public static Map<Integer, String> myMap() { // method

        // 1. adim map olusturma

        Map<Integer, String> urunList = new HashMap<>();

        // id, isim, uretici, miktar, birim, raf ekleniyor


        // 2.adim urunler ekleniiyor

        urunList.put(1000, "Yag, Yagcioglu, 12, litre, 0");
        urunList.put(1001, "Un, Uncuoglu, 6, kilo, 1");
        urunList.put(1002, "Seker, Sekercioglu, 3, kilo, 2");
        urunList.put(1003, "Ekmek, Ekmekcioglu, 11, tane, 3");
        urunList.put(1004, "Tuz, Tuzcuoglu, 7, tane, 4");
        urunList.put(1005, "Cay, Caycioglu, 9, kilo, 5");
        urunList.put(1006, "Sakiz, Sakizcioglu, 25, tene, 6");
        urunList.put(1007, "Simit, Simitcioglu, 8, tane, 7");

        return urunList;

    }
}
