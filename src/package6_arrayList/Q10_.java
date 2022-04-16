package package6_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10_ {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        ArrayList<String> isimler= new ArrayList<String >(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayan=new ArrayList<String >();

        for (String w:isimler){
            if (!w.toLowerCase().contains("a")){
                aOlmayan.add(w);
            }
        }
        System.out.println("a olmayan isimler : " + aOlmayan);

    }
}
