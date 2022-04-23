package aracKiralama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BilgilerClasss extends AracKiralama {

    static Scanner scan = new Scanner(System.in);
    static int toplamGun;
    static List<AracKiralama> aracTalebiList = new ArrayList<>();

    public static void aracTalep() {

        System.out.print("Lutfen teslim alacaginiz gunu giriniz: (Ornek : 19.12) ");
        String alisGunu = scan.next();

        System.out.print("Lutfen teslim alacaginiz saati giriniz: (Ornek : 19.00) ");
        double alisSaati = scan.nextDouble();

        System.out.print("Lutfen teslim edeceginiz gunu giriniz: (Ornek : 22.12) ");
        String teslimGunu = scan.next();

        System.out.print("Lutfen teslim edeceginiz saati giriniz: (Ornek : 19.00) ");
        double teslimSaati = scan.nextDouble();

        String aGun = alisGunu.substring(0, 2); //12.04
        int intAGunu = Integer.parseInt(aGun);

        String aAy = teslimGunu.substring(3); //12.04
        int intAAy = Integer.parseInt(aAy);

        System.out.println("Integer teslim tarihi: " + intAGunu + "." + intAAy);


        String vGun = teslimGunu.substring(0, 2); //12.04
        int intVGunu = Integer.parseInt(vGun);

        String vAy = teslimGunu.substring(3); //12.04
        int intVAy = Integer.parseInt(vAy);

        System.out.println("Integer teslim tarihi: " + intVGunu + "." + intVAy);

        if (intAAy > intVAy) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        } else if (intAGunu > intVGunu) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        }

        toplamGun = ((intVAy - intAAy) * 30 + (intVGunu - intAGunu));
        System.out.println("Araci kiraladiginiz toplam gun sayisi :" + toplamGun);

    }

    public static void getAraba(String marka, String model, String yakitTipi, String vites, Integer gunlukUcret) {
        aracTalebiList.stream().

                filter(t -> t.getMarka().equalsIgnoreCase(marka) && t.getModel().equalsIgnoreCase(model) &&
                        t.getYakitTipi().equalsIgnoreCase(yakitTipi) && t.getVites().equalsIgnoreCase(vites)).

                forEach(System.out::println);
    }


    public static void arabalar() {

        AracKiralama opelBenzinliManuel = new AracKiralama("Opel", "Vectra", "Benzin", "Manuel", 100);
        AracKiralama opelDizelManuel = new AracKiralama("Opel", "Vectra", "Dizel", "Manuel", 150);
        AracKiralama opelBenzinliOtomatik = new AracKiralama("Opel", "Astra", "Benzin", "Otomatik", 180);
        AracKiralama opelDizelOtomatik = new AracKiralama("Opel", "Astra", "Dizel", "Otomatik", 200);
        AracKiralama fordDizelOtomatik = new AracKiralama("Ford", "Fiesta", "Dizel", "Otomatik", 185);
        AracKiralama fordBenzinManuel = new AracKiralama("Ford", "Focus", "Benzin", "Manuel", 200);
        AracKiralama hondaDizelOtomatik = new AracKiralama("Honda", "Jazz", "Dizel", "Otomatik", 190);
        AracKiralama hondaBenzinManuel = new AracKiralama("Honda", "Jazz", "Benzin", "Manuel", 180);


        aracTalebiList.add(opelBenzinliManuel);
        aracTalebiList.add(opelDizelManuel);
        aracTalebiList.add(opelBenzinliOtomatik);
        aracTalebiList.add(opelDizelOtomatik);
        aracTalebiList.add(fordDizelOtomatik);
        aracTalebiList.add(fordBenzinManuel);
        aracTalebiList.add(hondaDizelOtomatik);
        aracTalebiList.add(hondaBenzinManuel);

        System.out.println("\n Lutfen talep ettiginiz aracin numarasini giriniz : \n1 : Opel Benzin Manuel " +
                "\n2 : Opel Dizel Manuel \n3 : Opel Benzinli Otomatik \n4 : Opel Dizel otomatik" +
                "\n5 : Ford Dizel Otomatik" + "\n6 : Ford Benzin Manuel\n7 : Honda Dizel Otomatik" +
                "\n8 : Honda Benzinli Manuel \n9 : cikis ");


        int secim = scan.nextInt();




        switch (secim) {
            case 1:

                getAraba("Opel", "Vectra", "Benzin", "Manuel", 100);

                BilgilerClasss.aracTalep();

                int odeme1 = toplamGun * 100;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme1);

                islemeDevamDongusu();

            case 2:

                getAraba("Opel", "Vectra", "Dizel", "Manuel", 150);

                BilgilerClasss.aracTalep();

                int odeme2 = toplamGun * 150;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme2);

                islemeDevamDongusu();

            case 3:

                getAraba("Opel", "Astra", "Benzin", "Otomatik", 180);

                BilgilerClasss.aracTalep();

                int odeme3 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme3);

                islemeDevamDongusu();


        }


    }


    private static void musteriBilgisi() {

        System.out.print("Lutfen adinizi ve soadinizi giriniz : ");
        String kimlik = scan.nextLine();

        scan.nextLine();

        System.out.print("Lutfen ID nizi giriniz : ");
        int ID = scan.nextInt();

        scan.nextLine();

        System.out.print("Lutfen telefon numarasi : ");
        String tlf = scan.nextLine();


        odemeBilgileri();
    }

    private static void odemeBilgileri() {
        System.out.print("Lutfen kart numaranizi giriniz : ");
        String kNo = scan.nextLine();

        int kartNoSayisi = 12;

        if (kartNoSayisi == kNo.length()) {
            System.out.print("Odemeniz basari ile gerceklestirildi iyi gunler : ");

            cikis1();

        } else if(kartNoSayisi != kNo.length()){
            System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz...");
            odemeBilgileri();
        }else {

        }

    }

    private static void islemeDevamDongusu() {

        System.out.println("Isleme devam etmek istiyorsaniz E bitirmek istiyorsaniz H yaziniz...");
        char ch = scan.next().toUpperCase().charAt(0);

        if (ch == 'E') {
            musteriBilgisi();

        } else if (ch == 'H') {
            arabalar();
        }else {

        }
    }
    private static void cikis1() {

        System.out.println("Tesekkur ederiz.. Yine bekleriz... Hayirli yolculuklar");

    }
}

