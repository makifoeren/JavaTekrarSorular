package teamSorulari;

import java.util.Scanner;

public class Ranner {




        public static void main(String[] args) {

            giris();


        }

        private static void giris() {


            Scanner scan = new Scanner(System.in);
            System.out.println("Geometrik islemlerden\n Kare icin 1'e" +
                    " \n Dikdörtgen icin 2 'ye\n Cember icin 3'e\n cikis icin 4'e bsin.");
            int secim = scan.nextInt();

            switch (secim) {
                case 1:
                    //KareIslemleri();
                    break;
                case 2:
                    // DikdörtgenIslemleri();
                    break;
                case 3:
                    // CemberIslemleri();
                    break;
                case 4:
                    cikis();
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz lütfen tekrar deneyin.");
                    giris();
                    break;

            }


        }

        public static void cikis() {
            System.out.println("Hoscakalin");
        }
    }

