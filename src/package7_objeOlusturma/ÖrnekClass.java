package package7_objeOlusturma;

import java.util.Scanner;

public class ÖrnekClass {


    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {

        String isim="Mehmet";
        String soyisim="Yalcin";
        String tel="123456";

        System.out.println("Isim = " + isim + " soyisim : " + soyisim + " telefon = " + tel);

        isimDegistir(isim,soyisim,tel);
        // Soyisimdegistir(soyisim);
        soyisim=Soyisimdegistir(soyisim);
        System.out.println("Isim = " + isim + " soyisim : " + soyisim + " telefon = " + tel);

    }

    private static String Soyisimdegistir(String soyisim) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Yeni soyisiminizi giriniz = ");
        String yenisoyisim= scan.nextLine();
        return yenisoyisim;
    }

    public static void isimDegistir(String isim, String soyisim, String tel) {
        isim="Yilmaz";
        soyisim="Kemal";
        tel="234678";

        System.out.println("Isim = " + isim + " soyisim : " + soyisim + " telefon = " + tel);

    }
}
