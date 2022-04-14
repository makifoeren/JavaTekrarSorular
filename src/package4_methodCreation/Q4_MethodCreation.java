package package4_methodCreation;

import java.util.Scanner;

public class Q4_MethodCreation {
    public static void main(String[] args) {
/*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */
       //double cm=23;

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen cm cinsinden bir deger giriniz = ");
        double cm=scan.nextDouble();
        döndürür(cm);



    }

    private static void döndürür(double cm) {

        double metre=cm/100;
        double kilometre=cm/1000;

        System.out.println("Girdiginiz deger " + metre + " metre ve " + kilometre + " dir.");
    }
}
