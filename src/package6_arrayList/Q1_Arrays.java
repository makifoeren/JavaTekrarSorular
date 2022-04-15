package package6_arrayList;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

           /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */


        int arr[] = {1, 2, -3, 4, -5, -6};
        System.out.println("Method kullanmadan önce = " + Arrays.toString(tersIsaret(arr)));



        System.out.println("Method kullanildiktan sonra = " + Arrays.toString(tersIsaret(arr)));

    }
    private static int[] tersIsaret(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] *= -1;

        }

        return arr;
    }

}

