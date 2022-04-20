package DataTimee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Kayit yeniKayit = new Kayit(); // obj ile method coll yapilacak

        List<Kullanici> kisi = new ArrayList<>();

        boolean cikilsinMi = false;

        while (!cikilsinMi) {
            System.out.println("Lutfen \n1: Kayit al \n2 : Sansli kisi bul \n3: kisileri listele \n4: cikis ");
            System.out.println("Islem seciniz...");
           int islem = scan.nextInt();

            switch (islem) {

                case 1:
                    kisi = yeniKayit.kayitAll(); // kisi listi degerini yeniKayit obj ile kayital method coll dan

                    break;

                case 2:
                    yeniKayit.sansliKullanici(kisi);

                    break;

                case 3:
                    yeniKayit.lsitele(kisi);

                    break;

                case 4:
                    cikilsinMi = false;

                    break;

                default:
                    System.out.println("Hatali veri girdiniz...");


            }

        }
    }
}