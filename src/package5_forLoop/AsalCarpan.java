package package5_forLoop;

import java.util.Scanner;

public class AsalCarpan {

    /* TASK :
     * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
     * METHOD create ediniz.
     *
     * Ör: Input : 50
     *     Bolenler : 2,5,10,20,50
     *     Asal Bolenler: 2,5
     *     En buyuk asal carpan: 5
     */

    static int bölen = 0;
    static boolean isAsal = false;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz ");
        int sayi = scan.nextInt(); //50

        asalCarpan(sayi);


    }

    private static void asalCarpan(int sayi) {

        int asalBölen=0;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                bölen=i;
                asalMi(bölen);
            } if (isAsal) {
                asalBölen=bölen;
            }

        }
    }

    private static boolean asalMi(int bölen) {

        for (int i = 2; i < bölen; i++) {
            if (bölen % i != 0) {
                isAsal = true;
            }else
                isAsal=false;
            break;

        }

        return isAsal;
    }
}



