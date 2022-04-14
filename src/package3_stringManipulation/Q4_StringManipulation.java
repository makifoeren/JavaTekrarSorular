package package3_stringManipulation;

import java.util.Scanner;

public class Q4_StringManipulation {
    public static void main(String[] args) {

         /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen birinci ismi giriniz : ");
        String birinciIsim=scan.nextLine().toLowerCase();

        System.out.print("Lütfen ikinci ismi giriniz : ");
        String ikinciIsim=scan.nextLine().toLowerCase();

        if (birinciIsim.length()%2 == 0){
            System.out.println(birinciIsim.substring(0,(birinciIsim.length()/2)).concat(ikinciIsim).
                    concat(birinciIsim.substring(birinciIsim.length()/2)));
        }else System.out.println("Isminiz %2==0 olmadigi icin ikinciIsmi ortasina yerlestiremedi");




    }
}
