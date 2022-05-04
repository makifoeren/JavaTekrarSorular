package interview_9;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {

/* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {
        String secim = "";

        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.println("Adinizi ve Soyadinizi giriniz...");
            kisiBilgileri.put("isim", scan.nextLine());
            System.out.println("Adresinizi giriniz...");
            kisiBilgileri.put("adres", scan.nextLine());
            System.out.println("Tlf numarasini giriniz..");
            kisiBilgileri.put("tlfn", scan.nextLine());
            System.out.println("Kimlik numarsini giriniz...");

            //icice yapi var kullanicidan aliğnan bilgiler TC ye gore sekillendigi icin..
            //kisiListesindeki TC datasi; diger kisiBilgilerini bunyesinde barindiriyor..
            kisiListesi.put(scan.nextInt(), kisiBilgileri); //TC yi kisiListesi map ine ekledik
            //TC-> Key;  kisiBilgileri-> Values

            scan.nextLine();

            System.out.println("kisiBilgileri = " + kisiBilgileri);
            System.out.println("kisiListesi =" + kisiListesi);
            System.out.println("Devam etmek icin E/H");
            secim = scan.nextLine();

        } while (secim.equalsIgnoreCase("E"));

        System.out.println("Gormek istediginiz kisinin kimlik numarsini giriniz...");
        System.out.println(kisiListesi.get(scan.nextInt()));

    }
}
