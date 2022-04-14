package package2_switchCase;

import java.util.Scanner;

public class Q4_SwitchCaseBankamatik {
    public static void main(String[] args) {

         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
  çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */


        Scanner scan = new Scanner(System.in);
        System.out.println("***Hosgeldiniz***");
        System.out.println("Lütfen yapacaginiz islemi seciniz : \nBakiye sorgulama icin : 1 \nPara cekmek icin :" + " 2 " +
                "\nPara yatirmak icin : 3  \nCikis islemleri icin 4" + " 'e basiniz . ");

        int islem=scan.nextInt();

        int bakiye=1000;

        switch(islem) {
            case 1:
                System.out.print("Mevcut bakiyeniz : " + bakiye);
                break;
            case 2:
                System.out.print("Cekeceginiz para miktarini giriniz : ");
                int cekilenMiktar= scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("Yeterli bakiyeniz mevcut degildir");
                }else
                bakiye -=cekilenMiktar;
                System.out.println("Para cektikten sonraki kalan bakiyeniz : " +bakiye);
                break;
            case 3:
                System.out.print("Yatiracaginiz miktari giriniz : ");
                int yatirilanMiktar=scan.nextInt();
                bakiye +=yatirilanMiktar;
                System.out.println("Para yatirdiktan sonraki bakiyeniz : " + bakiye);
                break;
            case 4:
                System.out.println("Cikisiniz basari ile tamamlanmistir . ");
                break;
                default:
                    System.out.println("Hatali giris yaptiniz");

        }







    }
}
