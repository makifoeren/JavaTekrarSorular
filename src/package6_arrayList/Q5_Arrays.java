package package6_arrayList;

import java.util.Arrays;

public class Q5_Arrays {
      /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

    public static void main(String[] args) {

        String str="ade1r4d3";
        String arr []=str.split("");
        System.out.println("String arr ye cevrildi = " + Arrays.toString((arr)));

        int toplam=0;

        for(int i=0; i<arr.length ; i++){
            if (Character.isDigit(arr[i].charAt(0))){ // charAt ile karakter haline isDigit ile
                                                   // karakterin rakam olup olmadigini soruyoruz
                toplam+=Integer.valueOf(arr[i]); // str daki degeri rakamsa alip toplayacak

            }
        }

        System.out.println("Str daki rakamlarin toplami = " + toplam);


    }


}
