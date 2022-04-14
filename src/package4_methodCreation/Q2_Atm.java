package package4_methodCreation;

import java.util.Scanner;

public class Q2_Atm {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);
       /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("***Hosgeldiniz***");
        System.out.println("Lütfen yapacaginiz islemi seciniz : \nBakiye sorgulama icin : 1 \nPara cekmek icin :" + " 2 " +
                "\nPara yatirmak icin : 3  \nCikis islemleri icin 4" + " 'e basiniz . ");

        secim();

    }

    private static void secim() {
        System.out.print("Yapacaginiz islemi seciniz : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cikis();
                break;

        }
    }

    private static void paraYatir() {
        System.out.println("Yatirmak istediginiz miktari giriniz =");
        int yatirilacakMiktar = scan.nextInt();
        bakiye += yatirilacakMiktar;
        System.out.println("Yatirilan miktar hesaba gecmistir");

        System.out.println("Isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n seciniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else

            cikis();

    }
    private static void paraCek() {
        System.out.println("Cekeceginiz miktari giriniz = ");
        int cekilecekMiktar = scan.nextInt();
        if (cekilecekMiktar>bakiye){
            System.out.println("Yetersiz bakiye");
        }else {
            bakiye -=cekilecekMiktar;
            System.out.println("Para cekme islemi basari ile tamamlanmistir");
        }
        System.out.println("Isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n seciniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else
            cikis();
    }

    private static void bakiyeSorgulama() {

        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("Isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n seciniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else
            cikis();
    }

    private static void cikis() {

        System.out.println("Cikisiniz yapildi tesekkür ederiz.");
    }
}
