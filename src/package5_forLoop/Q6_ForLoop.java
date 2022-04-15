package package5_forLoop;

import java.util.Scanner;

public class Q6_ForLoop {

    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen birinci sayi giriniz : \nikinci sayi icin enter e basiniz :");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int obeb = 0;
        int okek;

        for (int i = 1; i <=sayi1  && i<=sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                obeb = i;
            }
        }

        okek = (sayi1 * sayi2) / obeb;
        System.out.println(sayi1 + " ve " + sayi2 + " sayilarin OBEB = " + obeb);
        System.out.println(sayi1 + " ve " + sayi2 + " sayilarin OKEK = " + okek);


    }
}
