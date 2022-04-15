package package6_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_Arrays {
    /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz

        int []arr={2,6,4,8,2,6,2};

         */

    public static void main(String[] args) {
        int arr[]=new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println(Arrays.toString(arr)); // [ 0, 0, 0, 0, 0]


        boolean ayniMi=true;

        for(int i=0;
            i<arr.length; i++){
            System.out.print(i + ". indexs elemanini giriniz : ");
            arr[i] = scan.nextInt();

            if (arr[0]==arr[arr.length-1]){
                ayniMi=true;
            }else
                ayniMi=false;
        }
        System.out.println("Atamalar yapildiktan sonra arr = " + Arrays.toString(arr));
        System.out.println("Arr dizinizde ilk ve son eleman ayni mi ? = " + ayniMi);




    }
}
