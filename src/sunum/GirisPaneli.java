package sunum;

import java.util.Scanner;


public class GirisPaneli {

    static Scanner scan = new Scanner(System.in);


    public static void geometrikSekilHesaplama() {

        System.out.println("lutfen yapacaginiz istlemi sciniz 1,2,3,4...");

        int islem = 0;

        while(true) {
            try {
                islem = scan.nextInt();
                if (islem <= 0 || islem > 4) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Tercihler 1,2,34-....");
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("numerik veri girni");
            }

        }
        switch (islem) {

            case 1:
                System.out.println("Lutfen dikdortgenin uzun ve kisa kenarini giriniz...");
                double uzunKenar = scan.nextDouble();
                double kisaKenar = scan.nextDouble();

                Dikdortgen dikdortgen = new Dikdortgen(uzunKenar, kisaKenar);
                dikdortgen.cevreHesaplama();
                dikdortgen.alanHesaplama();
                System.out.println(dikdortgen);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz...");

                char ch = scan.next().toUpperCase().charAt(0);

                if (ch == 'E') {
                    geometrikSekilHesaplama();
                } else if (ch == 'H') {
                    cikis();

                } else
                    System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz,,,");
                System.out.println(" ");
                geometrikSekilHesaplama();
                break;

            case 2:
                System.out.println("Lutfen kare uzun ve kisa kenarini giriniz...");
                double uzunKenarK = scan.nextDouble();
                double kisaKenarK = scan.nextDouble();

                Kare kare = new Kare(uzunKenarK, kisaKenarK);
                kare.cevreHesaplama();
                kare.alanHesaplama();
                System.out.println(kare);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz...");

                char chk = scan.next().toUpperCase().charAt(0);

                if (chk == 'E') {
                    geometrikSekilHesaplama();
                } else if (chk == 'H') {
                    cikis();

                } else
                    System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz,,,");
                System.out.println(" ");
                geometrikSekilHesaplama();
                break;
            case 3:
                System.out.println("Lutfen kcemberin yaricapini giriniz...");

                double yariCap = scan.nextDouble();

                Cember cember = new Cember(yariCap);
                cember.cevreHesaplama();
                cember.alanHesaplama();
                System.out.println(cember);

                System.out.println("Devam etmek icin E islemden cikmak icin H yaziniz...");

                char chc = scan.next().toUpperCase().charAt(0);

                if (chc == 'E') {
                    geometrikSekilHesaplama();
                } else if (chc == 'H') {
                    cikis();

                } else
                    System.out.println("Hatali veri girdiniz lutfen tekrar deneyiniz,,,");
                System.out.println(" ");
                geometrikSekilHesaplama();
                break;

            case 4:
                cikis();
                break;

            default:
                System.out.println("hatli veri giridniz");

                geometrikSekilHesaplama();
                break;

        }


    }

    public static void cikis() {
        System.out.println("Hoscakalin iyi calismalar.....");
    }
}
