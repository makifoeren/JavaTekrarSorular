package package1_ifElse;

import java.util.Scanner;

public class Q1_IfElseStatement {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Y ve N harfinden birini seciniz");
    char karakter=scan.next().charAt(0);

        if (karakter == 'Y' || karakter=='y'){
            System.out.println("YES");
        }else if (karakter=='N' || karakter=='n') {
            System.out.println("NO");
        }else {
            System.out.println("Gecersiz harf girdiniz");
        }


    }
}
