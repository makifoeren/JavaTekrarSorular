package package3_stringManipulation;

import java.util.Scanner;

public class Q7_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 4 harfli bir kelime giriniz = ");
        String kelime =scan.next();

        if (kelime.length()<=4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char üc=kelime.charAt(2);
            char dört=kelime.charAt(3);

            System.out.println("Kelimenin tersten yazilisi = " + dört+üc+iki+bir);
        } else System.out.println("Lütfen 4 karalterli bir kelime giriniz");







    }
}
