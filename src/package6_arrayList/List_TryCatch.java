package package6_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_TryCatch {

    /*
    Ogrt menin girmek istedigi notu aliniz
    ortlamayi gecen ogrenci sayisini create ediniz
    not 0 ile 100 arasi olmali
    not girisini bitirmek icin X e basiniz
    Yanlis ihtimal karsi try catch atiniz

     */


    public static void main(String[] args) {
        List<Integer> ogrnciNotlari = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int ogrenciSayac=1;

        while (true){
            System.out.println("Bitirmek icin X e basiniz..");
            System.out.print(ogrenciSayac + ". Ogrenci notu giriniz : ");

            int ogrNot=0;
            try {
                ogrNot=scan.nextInt();
                if (ogrNot<0 || ogrNot>100){
                    System.out.println("Ogrenci notlari 0 ile 100 arasi olmalidir...");
                } else {
                    ogrnciNotlari.add(ogrNot);
                    ogrenciSayac++;
                }
            } catch (Exception e) {
               String str=scan.next();
               if (str.equalsIgnoreCase("X")) break;
               else System.out.println("Hatali giris yaptiniz... Tekrar deneyiniz...");
            }
        }

        double toplam=0;

        for (int i = 0; i < ogrnciNotlari.size(); i++) {
        toplam +=ogrnciNotlari.get(i);
        }
        double ortalama=toplam/ogrnciNotlari.size();

        int ortalamaUstuOgrenciSayisi=0;
        for (int i = 0; i < ogrnciNotlari.size(); i++) {
            if (ogrnciNotlari.get(i)>ortalama);
            ortalamaUstuOgrenciSayisi++;

        }
        System.out.println("Genel ortalama : "+ ortalama);
        System.out.println("Ortalama usti ogrenci sayisi :" + ortalamaUstuOgrenciSayisi);
    }


}

