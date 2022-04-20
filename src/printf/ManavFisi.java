package printf;

public class ManavFisi {

/*
Toplam tutarlari virgülden sonra iki basamak olacak sekilde sonrasi dikkate alinmyacak sekilde yazdirin
miktar 1,2,3.5,2.5,6
birim fiyat 2.3,2.29,4.1,2.3
stis
String icin s veya S
int icin d
double icin f kullanilir

 */

    public static void main(String[] args) {
        String urun[]={"Domates","Biber","Patlican","Elma","Armut"};
        double brFiyat[]={2.3,2.29,4.1,2.3,8};
        double miktar[]={1,2,3.5,2.5,6};

        System.out.println("Urun    miktar  br_fiyat  urun_toplam");
        System.out.println("=====================================");


        for (int i = 0; i < urun.length; i++) {

            System.out.printf("%-8s  %5.2fkg  $%5.2f  $%05.2f \n" ,urun[i],miktar[i],brFiyat[i],miktar[i],miktar[i]*brFiyat[i]);

        }
        System.out.println("=====================================");

        double toplamUrunMIktari=0;

        for (int i = 0; i <miktar.length ; i++) {
            toplamUrunMIktari+=miktar[i];
        }

        double toplamOdenecekPara=0;

        for (int i = 0; i <miktar.length ; i++) {
            toplamOdenecekPara+=miktar[i]*brFiyat[i];
        }

        System.out.printf("Genel Toplam  %5.2fkg  $%5.2f", toplamUrunMIktari,toplamOdenecekPara);

    }

}
