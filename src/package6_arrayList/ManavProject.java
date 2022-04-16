package package6_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

    static List<String> ürünListesi = new ArrayList<String>();
    static List<Double> ürünFiyatlari = new ArrayList<Double>();
    static double toplamÖdeme;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        ürünListesi.add("domates - ürün kodu : 1 ");
        ürünListesi.add("muz - ürün kodu : 2 ");
        ürünListesi.add("elma - ürün kodu : 3 ");
        ürünListesi.add("erik - ürün kodu : 4 ");
        ürünListesi.add("cilek - ürün kodu : 5 ");

        ürünFiyatlari.add(15.0);
        ürünFiyatlari.add(18.0);
        ürünFiyatlari.add(8.0);
        ürünFiyatlari.add(47.0);
        ürünFiyatlari.add(27.0);

        System.out.println("Ürünlerin listelenmis hali : " + ürünListesi);
        System.out.println("Ürünlerin fiyatlarinin listelenmis hali : " + ürünFiyatlari);

        müsteriSecim();


    }

    private static void müsteriSecim() {
        System.out.print("Sectiginiz ürünün kodunu giriniz : ");
        int secim=scan.nextInt();
        System.out.print("Sectiginiz üründen kac kg alacaksiniz : ");
        double kilo=scan.nextDouble();

        double ürünTutari=kilo*ürünFiyatlari.get(secim-1);
        toplamÖdeme+=ürünTutari;

        System.out.print("alisverise devam etmek istiyorsaiz 1 kasa icin 2 yi seciniz : ");
        int devam = scan.nextInt();
        if (devam==1){
            müsteriSecim();
        }else {
            kasa();
        }

    }

    private static void kasa() {
        System.out.println("Tesekkür ederi toplam ödemeniz : " + toplamÖdeme + " dir.");

    }
}