package package1_ifElse;

import java.util.Scanner;



public class Q7_IfElseStatementTernary {
    public static void main(String[] args) {
        // TASK:
        // Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
        /*
        Artik yil 100 ün kati yillardan ve 400 e tam bölünebilen yildir
        örnek 1200,1600...
        4 rakaminin kati olan yillaridr
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("aratmak istediginiz yili giriniz = ");
        int yil=scan.nextInt();

        if (yil%100==0 && yil%400==0) {
            System.out.println("Girilen yil = " + yil + " artik yildir. ");
        }else if (yil%100!=0 && yil%4==0) {
            System.out.println("Girilen yil = " + yil + " artik yildir. ");
        }else {
            System.out.println("Girilen yil = " + yil + " artik yil degildir. ");
        }

        System.out.println("********TERNARY CÖZÜMÜ*******");

        String sonuc=yil % 100 == 0 ? yil % 400 == 0 ? " Girilen tarih artik yildir. " : " Girilen tarih artik yil degildir." :
                yil % 4 == 0 ? " Girilen tarih artik yildir." : " Girilen tarih artik yil degildir.";

        System.out.println(sonuc);

    }

}
