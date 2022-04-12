package package1_ifElse;

import java.util.Scanner;

public class Q3_IfElseStatement {

    /*8 hluk hc
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kac adet ürün aldiginizi yaziniz ");
        int adet = scan.nextInt();

        System.out.println("Lütfen ürünün fiyatini giriniz ");
        double fiyat = scan.nextDouble();

        System.out.println("Müsteri katiniz var mi? \n Varsa E Yoksa H giriniz");
        char katiniz = scan.next().toUpperCase().charAt(0);

        double ödeme=adet*fiyat;


        if (katiniz == 'E') {
            if (adet > 10) {

                System.out.println("Müsteri kartiniz oldugu icin ödemeniz gereken fiyat = " + (ödeme * 0.80));
            } else {
                System.out.println("Müsteri kartiniz oldugu icin ödemeniz gereken fiyat = " + (ödeme * 0.85));
            }
        } else if (katiniz == 'H') {
            if (adet > 10) {
                System.out.println("Müsteri kartiniz olmadigi icin ödemeniz gereken fiyat = " + (ödeme * 0.85));
            } else {
                System.out.println("Müsteri kartiniz oldugu icin ödemeniz gereken fiyat = " + (ödeme * 0.90));
            }
        }else {
            System.out.println("Yanlis giris yaptiniz");
        }

    }
}
