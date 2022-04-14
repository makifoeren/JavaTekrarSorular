package package2_switchCase;

import java.util.Scanner;

public class Q3_SwitchCase {
    public static void main(String[] args) {


        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.print
                ("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                        "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");

        int kacıncıGün = scan.nextInt();
        System.out.print("Kac gun sonrasını öğrenmek istiyorsunuz : ");

        int kacGünSonrasi = scan.nextInt();
        int bulunanGün = (kacGünSonrasi + kacıncıGün) % 7;

        switch(bulunanGün) {
            case 1:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Pazartesi");
                break;
                case 2:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Sali");
                break;
                case 3:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Carsamba");
                break;
                case 4:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Persembe");
                break;
                case 5:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Cuma");
                break;
                case 6:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Cumartesi");
                break;
            case 0:
                System.out.println(kacGünSonrasi + " gün sonra günlerden Pazar");
                break;

            default :
                System.out.println("Hafta yedi gün");
        }


    }
}