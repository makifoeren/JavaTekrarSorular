package interview_1;

import java.util.Scanner;

public class Q05_ForFlashBack {

    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cumlenizi giriniz...");
        String cumle=scan.nextLine().toLowerCase();

        System.out.println("Lutfen aradiginiz harfi giriniz...");
        char harf=scan.next().toLowerCase().charAt(0);


        int toplam=0;

        for (int i = 0; i <cumle.length(); i++) {
            if (harf == cumle.charAt(i)) {
                toplam++;
            }
        }
        System.out.println("Aradiginiz " + harf + " karakteri " + cumle + " cumlesin'de toplam " + toplam + " kere gecmistir.");




    }
}
