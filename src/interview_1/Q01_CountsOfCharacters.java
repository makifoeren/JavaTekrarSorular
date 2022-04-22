package interview_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacters {


    /*
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
           abaa   ==> a=3  b=1
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz...");
        String str = scan.nextLine();

        String arr[] = str.split(""); //karakterleri ayirmak icin
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // siraliyor

        int toplam = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) { // 0 ile 1 esit ise toplami arttir
                toplam++;
            } else {
                System.out.println(arr[i - 1] + " sayiyi " + (toplam + 1));
                toplam = 0;
            }

            if (i==arr.length - 1){ // en sona geldiginde
                System.out.println(arr[i] + " sayisi " + (toplam+1));

            }
        }
    }
}
