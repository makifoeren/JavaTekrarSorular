package package5_forLoop;

import java.util.Scanner;

public class AsalCarpan {

    static int bolen = 0;
    static boolean isAsal = false;

    public static void main(String[] args) {
        /* TASK :
         * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
         * METHOD create ediniz.
         *
         * Ör: Input : 50
         *     Bolenler : 2,5,10,20,50
         *     Asal Bolenler: 2,5
         *     En buyuk asal carpan: 5
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz... ");
        int sayi = scan.nextInt(); //50

        asalCarpan(sayi);

    }

    private static void asalCarpan(int sayi) {
        int asalBolen=0;

        for (int i = 2; i <= sayi; i++) {

            if (sayi % i == 0) {
                bolen = i;
                asalMi(bolen);  //method call bolanin asal olup olmadigini kontrol ediyor
            }if(isAsal){
                asalBolen=bolen;
            }

        }
        System.out.println("girdiginiz sayinin en büyük asal böleni :" + asalBolen);
    }

    private static boolean asalMi(int bolen) {

        for (int i = 2; i < bolen; i++) {

            if (bolen % i != 0) { //bölen sayisina kadar tamsayilar bolundugunde kalan0 degilse
                //bu sayi kendisinden baska hic bir sayiya tam bölünmez
                // ==0 derde asagida isAsal=false deyip break yapacaz
                isAsal = true;
            }else isAsal=false;
            break;

        }

        return isAsal;
    }
}



