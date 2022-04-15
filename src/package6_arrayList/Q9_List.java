package package6_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q9_List {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        List<String> mevcutListe=new ArrayList<>();

        mevcutListe.add("Ahmet");
        mevcutListe.add("Mehmet");
        mevcutListe.add("Can");
        mevcutListe.add("Nilgün");
        mevcutListe.add("Nergis");
        mevcutListe.add("Ali");
        System.out.println("Mevcut lsitedeki isimler = " + mevcutListe);

        Scanner scan = new Scanner(System.in);
        System.out.print("1. adim aradiginiz ismi giriniz ");

        String isim= scan.nextLine().trim();
        System.out.println("2. adim isimdeki bosluklari silindi :  "  + isim);

        boolean kullaniciIsmiVarMi=mevcutListe.contains(isim);
        System.out.println("3. adim kullanici ismi listede var mi ? = " + kullaniciIsmiVarMi);

        if (kullaniciIsmiVarMi){
            System.out.println("4. adim bu kullanici adi zaten alinmis " );
        } else {
            System.out.println("4. adim bu kullanici adini kullanabilirsiniz ");
        }

        if (kullaniciIsmiVarMi){
            int rastgele=new Random().nextInt(100);
            isim=isim + "" + rastgele;
            System.out.println("5. adim yeni kullanici adi olarak :" + isim + " kullanabilirsiniz");

        }else{
            System.out.println("5. adim yeni kullanici adi : " + isim);
        }




    }
}
