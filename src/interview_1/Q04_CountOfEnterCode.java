package interview_1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {


        String pinKodu="asdf1234.";
        int girisHakki=4;

        Scanner scan = new Scanner(System.in);

        System.out.println("****Hosgeldiniz*****");


               while(true){

                   System.out.println("Lütfen pin kodunu giriniz");
                   String girilenPin=scan.nextLine().toLowerCase();

                   if (pinKodu.equals(girilenPin)){
                       System.out.println("Basarili giris yaptiniz...");
                       break;
                   }else {
                       System.out.println("Yanlis giris yaptiniz...");
                       girisHakki--;
                       System.out.println("Kalan giris hakkiniz : " +girisHakki);
                   }if (girisHakki ==0) {
                       System.out.println("Giris hakkiniz kalmadi kartiniz bloke oldu..");
                       break;

                   }
               }

    }
}
