package package11_linkedListSet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        /*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

			 */

        LinkedList<String> list=new LinkedList<>(Arrays.asList("HALUK", "IPEK", "HARUN", "IREM"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aradiginiz ismi giririniz...");
        String isim=scan.nextLine().toUpperCase();

        if (list.remove(isim)){

            System.out.println("Bu isim LinkedList'de vardi ve silindi");


        }else System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
        System.out.println(list);
    }
}
