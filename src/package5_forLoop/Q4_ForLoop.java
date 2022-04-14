package package5_forLoop;

import java.util.Scanner;

public class Q4_ForLoop {
     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz");
        String kelime = scan.nextLine();

        String sesliHarfler="aeioöuüAEIOÖUÜ";

        for (int i = 0; i < sesliHarfler.length(); i++) {
            if (sesliHarfler.contains(kelime.substring(0,1))) {

                System.out.println("Sesli harf");
                break;
            } else {
                System.out.println("Sessiz harf");
                break;
            }
        }

        }



    }


