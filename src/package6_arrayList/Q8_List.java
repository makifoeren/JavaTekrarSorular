package package6_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8_List {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Listenizin uzunlugunu giriniz : ");
        int listUzunlugunu = scan.nextInt();

        List<Integer> list=new ArrayList<>();
        System.out.println("Liste uzunlugu kadar eleman giriniz :");

        for (int i = 0; i < listUzunlugunu; i++) {
            list.add(scan.nextInt());

        }
        tekraredenEleman(list);



    }

    private static void tekraredenEleman(List<Integer> list) {
        List<Integer> tekrarliList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size(); j++) {
                if (list.get(i)== list.get(j) && !tekrarliList.contains(list.get(i))){
                    tekrarliList.add(list.get(i));

                }

            }

            }
        System.out.println("Tekrarli liste elemanlari = " + tekrarliList);
        }
    }
