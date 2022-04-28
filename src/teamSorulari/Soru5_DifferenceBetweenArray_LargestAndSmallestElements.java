package teamSorulari;

import java.util.*;

public class Soru5_DifferenceBetweenArray_LargestAndSmallestElements {

    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
       kullanıcının girdigi bir array'in en buyuk elemani ile
       en kucuk elemanının  farkını bulan bir method create ediniz.
    */

  public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(4, 2, 6, 11));
        arrMethod(sayi);
    }

    private static void arrMethod(List<Integer> sayi) {

        Optional<Integer> max = sayi.stream().reduce(Integer::max);
        Optional<Integer> min = sayi.stream().reduce(Integer::min);


        System.out.println(Collections.max(sayi) - Collections.min(sayi));

    }

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Array uzunlugunuzu giriniz...");
        int uzunluk = scan.nextInt();
        int arr[] = new int[uzunluk];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Arrayin " + (i + 1) + ".elemanini giriniz");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array in son elemni ile ilk elemanin farki : " + (arr[arr.length - 1] - arr[0]));


    }*/

    }

