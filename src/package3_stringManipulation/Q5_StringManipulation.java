package package3_stringManipulation;

import java.util.Scanner;

public class Q5_StringManipulation {

    public static void main(String[] args) {


        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir  ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz
         * e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci ismi giriniz : ");
        String str=scan.nextLine();

        char k1=str.charAt(0);
        char k2=str.charAt(1);
        char k3=str.charAt(2);

        String sonuc= str.length() == 3 ? ((k1!=k2 & k1!=k3 & k2!=k3) ? "Cümle 3 harfli ve unique(farkli) karakterlere sahip" :
                "Cümle 3 harfli ve unique(farkli) karakterlere sahip degildir. " ) : "Cümle 3 harfli degildir";

        System.out.println(sonuc);


    }
}
