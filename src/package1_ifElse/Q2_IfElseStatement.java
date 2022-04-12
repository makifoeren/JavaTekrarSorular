package package1_ifElse;

import java.util.Scanner;

public class Q2_IfElseStatement {

    /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yasinizi giriniz ");
        int yas=scan.nextInt();

        System.out.print("Lütfen kilonuzu giriniz ");
        double kilo= scan.nextDouble();

        if (yas > 0 && yas < 18){
            System.out.println("Yasniz kücük oldugu icin kan bagisi yapamazsiniz");

        }else if(yas >= 18){

            if (kilo > 0 && kilo < 50
            ){

                System.out.println("Yeterli agirliga sahil olmadiginiz icin kan bagisi yapamzsiniz");

        }else if (kilo >= 50) {

                System.out.println("Kan bagisi yapabilirsin");

            }else System.out.println("Kilonuzu hatali girdiniz");

        }else System.out.println("Hatali veri girdiniz");

    }

}
