package package1_ifElse;

import java.util.Scanner;

public class Q6_IfElseStatement {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen a,b,c sayilarini giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int delta=(b*b)-(4*a*c);

        if (delta>0 ) {
            double x1=(-b + Math.sqrt(delta)) / (2*a);
            double x2=(-b - Math.sqrt(delta)) / (2*a);

            System.out.println("Girdiginiz denklemin iki tane kökü vardir. " + " \n1.kök " + x1 + " \n2.kök " + x2);

        }else if (delta==0) {
            double x=-b/2*a;
            System.out.println("Girdiginiz denklemin bir tane kökü vardir. " + " \n1.kök " + x);
        }else {
            System.out.println("Girdiginiz denklemin kökü yoktur. ");
        }











    }
}
