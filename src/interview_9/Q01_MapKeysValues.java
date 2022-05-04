package interview_9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {
        //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
        HashMap<String, Integer> ulke = new HashMap<>();

        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 65);
        ulke.put("Kanada", 40);

        //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
        System.out.println("Ulke isimleri ve nufuslari : " + ulke + " milyondur.");

        //5 tane ulke ismi yazdırıyoruz. (keyset())
        System.out.println("Ulke isimleri :" + ulke.keySet());

        //5 tane ulke nufusunu yazdırıyoruz. (values())
        System.out.println("Ulke nufuslari :" + ulke.values());

        //nüfusların toplamını yazdırın.

        int nufus = 0;
        for (Integer toplam:ulke.values()
        ) {
            nufus +=toplam;

        }
        System.out.println("nufus toplami : " + nufus);


        //kaç tane 50 milyondan fazla nüfuslu ülke var?

        int sayac=0;

        for (Integer buyukMu :ulke.values()
             ) {
            if (buyukMu>50){
                sayac++;
            }
        }

        System.out.println("Nufusu 50 mlyn dan fazla ulkeler : " + sayac);

        // ulke ve nufus siralamasi

        for (Map.Entry<String,Integer> siralama:ulke.entrySet()) {
            System.out.println( siralama);
        }

        // ulke sirasi

        for (String ulkeSirasi:ulke.keySet()
             ) {
            System.out.println(ulkeSirasi);
        }
// nufus surassi
        for (Integer nufusSirasi:ulke.values()
        ) {
            System.out.println(nufusSirasi);
        }

    }
}