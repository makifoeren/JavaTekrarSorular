package package2_switchCase;

import java.util.Scanner;

public class Q5_SwitcCaseSeyehat {
    public static void main(String[] args) {

 /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---
          Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.

      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.

        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.

         */


        Scanner scan = new Scanner(System.in);
        System.out.print("***** Hosgeldiniz *****");
        System.out.print("Lütfen gitmek istediginiz sehri secinzi \n 1- Frankfurt 60 Km \n 2 -Köln 80 Km " +
                "\n20 Km basina 5 Euro ücretlendirme yapilir.  ");
        String gidilecekSehir = scan.next().toUpperCase();

        double bakiye=100;
        double FrankfurtÜcret=(60/20)*5;
        double KölnÜcret=(80/20)*5;

        switch(gidilecekSehir) {
            case  "1" :
                System.out.println("Gitmek istediginiz Rota : Frankfurt");
                System.out.println("Frankfurt bilet ücreti : " + FrankfurtÜcret + " Euro dur.");
                System.out.println("Kac kisi seyehat edeceksiniz : ");
                int kisi = scan.nextInt();

                switch (kisi) {
                    case 1:
                        System.out.println("1 kişilik bilet talep ettiniz " + " \nBilet tutarınız : "
                                + FrankfurtÜcret + "EURO" + " \nGüncel bakıyeniz : " + (bakiye -= FrankfurtÜcret));


                        break;
                    case 2:
                        System.out.println("2 kişilik bilet talep ettiniz " +
                                " bilet tutarınız : " + (FrankfurtÜcret * 2) + " EURO" + "\n Güncel bakıyeniz: " + (bakiye -= FrankfurtÜcret * 2));

                        break;
                    default:
                        System.out.println(" Hatali giriş yaptınız");
                        break;
                }

                break;

            case "2" :
                System.out.println("Gitmek istediginiz Rota : Köln");
                System.out.println("Frankfurt bilet ücreti : " + KölnÜcret + " Euro dur.");
                System.out.print("Kac kisi seyehat edeceksiniz : ");
                int kisi1 = scan.nextInt();

                switch (kisi1) {
                    case 1:
                        System.out.println("1 kişilik bilet talep ettiniz " + " bilet tutarınız : "
                                + KölnÜcret + " EURO " + " \nGüncel bakıyeniz: " + (bakiye -= KölnÜcret));


                        break;
                    case 2:
                        System.out.println("2 kişilik bilet talep ettiniz " +
                                " bilet tutarınız : " + (KölnÜcret * 2) + " EURO" +
                                " \nGüncel bakıyeniz: " + (bakiye -= KölnÜcret * 2));

                        break;
                    default:
                        System.out.println(" Hatali  giriş yaptınız");
                        break;
                }


                break;
        }











    }
}
