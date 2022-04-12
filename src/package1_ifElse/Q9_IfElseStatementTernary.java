package package1_ifElse;

import java.util.Scanner;

public class Q9_IfElseStatementTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deger=scan.nextInt();

        String sonuc= (deger%5==0) ? (deger%2==0 ? "Bu sayi 2 ve 5 e bölünen bir cift sayidir" :
                "Bu sayi sadece 5 e bölünen tek bir sayidir" ) : ("Bu sayi  5 e bölünmeyen bir sayidir");

        System.out.println(sonuc);

    }
}
