package teamSorulari;


import java.util.Scanner;

public class Soru5_ArrTekraredenSayi {
     /*
        Verilen bir sayının, bir dizide kaç defa tekrarlandığını
        bulan Java programını oluşturun.


         */

    public static void main(String[] args) {



         int [] arr={1,1,1,22,4,5,77,77,9,76}; // 1
        int sayac=0;


         Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen aratmak istediginiz sayiyi giriniz"); // 2

        int ara=scan.nextInt();



        for (int i = 0; i < arr.length; i++) { //3
            if(ara==arr[i]) {

            sayac=sayac + 1; }

        }
        System.out.println("Dizide aradigimiz sayi =" + ara);
        System.out.println("Dizide tekrar edilme sayisi = " + sayac);



    }

}


