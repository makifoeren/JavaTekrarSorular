package package11_linkedListSet;

import java.util.HashSet;

public class Q02 {

     /* TASK:
    parametresi Integer set ve integer array ve adi elementEkle
    olan bir method create ediniz .
    yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
     */

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>(); //hizli olsundiye

        int arr[]=new int[]{1,2,3,4,5,6,7};

        elementEkle(hs,arr); //1 2 3 4 5 6 7
        System.out.println(" ");
        elementEkle(hs,new int[]{12,34,56,76,77,4,4,2}); //1 2 34 3 4 5 6 7 56 12 76 77

    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {

        HashSet<Integer> hs2=new HashSet<>();

        for (Integer sayi:arr
             ) {
            hs.add(sayi);
        }
        yazdir(hs);
    }
    public static void yazdir( HashSet<Integer> hs){
        for (Integer s:hs
             ) {
            System.out.print(s +" ");
        }
    }
}
