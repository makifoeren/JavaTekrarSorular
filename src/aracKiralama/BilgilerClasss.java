package aracKiralama;

import java.util.Scanner;

public class BilgilerClasss  extends AracKiralama{

    static Scanner scan = new Scanner(System.in);
    static int toplamGun;

    public static void aracTalep() {

        System.out.print("Lutfen teslim alacaginiz gunu giriniz: ");
        String alisGunu = scan.next();

        System.out.print("Lutfen teslim alacaginiz saati giriniz: ");
        double alisSaati = scan.nextDouble();

        System.out.print("Lutfen teslim edeceginiz gunu giriniz: ");
        String teslimGunu = scan.next();

        System.out.print("Lutfen teslim edeceginiz saati giriniz: ");
        double teslimSaati = scan.nextDouble();

        String aGun = alisGunu.substring(0, 2); //12.04
        int intAGunu = Integer.parseInt(aGun);

        String aAy = teslimGunu.substring(3); //12.04
        int intAAy = Integer.parseInt(aAy);

        System.out.println("Integer teslim tarihi: " + intAGunu + "." + intAAy);


        String vGun = teslimGunu.substring(0, 2); //12.04
        int intVGunu = Integer.parseInt(vGun);

        String vAy = teslimGunu.substring(3); //12.04
        int intVAy = Integer.parseInt(vAy);

        System.out.println("Integer teslim tarihi: " + intVGunu + "." + intVAy);

        if (intAAy > intVAy) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        } else if (intAGunu > intVGunu) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        }

        toplamGun = ((intVAy - intAAy) * 30 + (intVGunu - intAGunu));
        System.out.println("Araci kiraladiginiz toplam gun sayisi :" + toplamGun);



        
    }

}
