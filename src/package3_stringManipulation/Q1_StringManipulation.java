package package3_stringManipulation;

import java.util.Scanner;

public class Q1_StringManipulation {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String cümle = scan.nextLine();

        boolean boslukVarMi=cümle.contains(" ");

        System.out.println("Girilen cümlede bosluk var mi ? " + boslukVarMi);

        System.out.println("17. satir icin soruyorum " + cümle.isEmpty());


    }
}
