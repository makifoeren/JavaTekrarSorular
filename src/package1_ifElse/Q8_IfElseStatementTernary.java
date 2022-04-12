package package1_ifElse;

import java.util.Scanner;

public class Q8_IfElseStatementTernary {
    public static void main(String[] args) {

        /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int sayi = scan.nextInt();

        if (sayi>0) {
            if (sayi<10){
                System.out.println("Rakam");
            }else if (sayi>10) {
                System.out.println("Pozitif Sayi");
            }
        }else if (sayi<0) {
            System.out.println("Negatif sayi");
        }
        System.out.println("*****TERNARY CÖZÜMÜ*****");

        String sonuc = ( sayi>0 ) ? (sayi<10 ? "Rakam" : "Pozitif Sayi" ) : ("Negatif sayi");

        System.out.println(sonuc);

    }
}
