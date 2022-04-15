package package6_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_Arrays {
     /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */

    public static void main(String[] args) {

        int arr[]=new int[8];

        Scanner scan = new Scanner(System.in);

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        int sayac=0;

        for(int i=0; i<arr.length; i++){
            System.out.print(i + ". indexs elemanini giriniz : ");
            arr[i] = scan.nextInt();


            if (arr[i] %3 ==0){
                sayac++;
            }
        }
        System.out.println("Atamalar yapildiktan sonra arr = " + Arrays.toString(arr));
        System.out.println("Arr dizinizde 3'e tam bölünebilen eleman sayisi = " + sayac);




    }
}
