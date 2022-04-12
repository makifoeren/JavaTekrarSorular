package package1_ifElse;

import java.util.Locale;
import java.util.Scanner;

public class Q4_IfElseStatement {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------
            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);

        System.out.print("Ehliyetniz varsa Y yoksa N basiniz ");
        char ehliyet = scan.next().toLowerCase().charAt(0);

        if (ehliyet == 'Y' || ehliyet == 'N') {
            if (ehliyet == 'N') {
                System.out.println("Ehliyetiniz olmadigi icin 200 $ ceza aldiniz. "); }


            System.out.print("Hizinizi giriniz = ");
            int hiz = scan.nextInt();

            if (ehliyet == 'Y') {
                if (hiz < 0) {
                    System.out.println("Hiziniz sifir dan kücük olamaz yanlis deger girdiniz");
                } else if (hiz >= 55 && hiz < 74) {
                    System.out.println("Cezaniz 100 $ dir. ");
                } else if (hiz >= 74 && hiz < 84) {
                    System.out.println("Cezaniz 150 $ dir.");
                } else if (hiz >= 84 && hiz < 94) {
                    System.out.println("Cezaniz 320 $ dir.");
                } else if (hiz >= 94) {
                    System.out.println("Cezaniz 500 $ dir.");
                } else {
                    System.out.println("Hiz sinirinda gidiyorsunuz. Hayirli yolculuklar");
                }
            } else if (ehliyet == 'N') {
                if (hiz < 0) {
                    System.out.println("Hiziniz sifir dan kücük olamaz yanlis deger girdiniz");
                } else if (hiz >= 55 && hiz < 74) {
                    System.out.println("Cezaniz 300 $ dir. ");
                } else if (hiz >= 74 && hiz < 84) {
                    System.out.println("Cezaniz 350 $ dir.");
                } else if (hiz >= 84 && hiz < 94) {
                    System.out.println("Cezaniz 520 $ dir.");
                } else if (hiz >= 94) {
                    System.out.println("Cezaniz 700 $ dir.");
                } else {
                    System.out.println("Hiz sinirinda gidiyorsunuz. Ehliyetiniz olmadigi icin 200 $ ceza aldiniz." +
                            "Hayirli yolculuklar");
                }
            } else {
                System.out.println("Lütfen gecerli bir veri giriniz");
            }
        }else {
            System.out.println("Ehliyet var mi yok mu");
        }
    }

}