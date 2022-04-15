package package6_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_Arrays {

    public static void main(String[] args) {
        /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */


       //int arr []={2,6,4,5,8,9};

        int arr[]=new int[4];

        Scanner scan = new Scanner(System.in);



        for(int i=0; i<arr.length; i++){
            System.out.print(i + ". indexs elemanini giriniz : ");
            arr[i] = scan.nextInt();


        }

        System.out.println("Atamalar yapildiktan sonra arr = " + Arrays.toString(arr));

        System.out.println("Elemenlarin karesi alinamdan önce = " + Arrays.toString(arr));


        for (int i=0; i<arr.length; i++){

            arr[i] *=arr[i];
        }
        System.out.println("Elemenlarin karesi = " + Arrays.toString(arr));
    }
}
