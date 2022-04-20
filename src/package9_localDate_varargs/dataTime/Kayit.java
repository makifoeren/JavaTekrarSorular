package package9_localDate_varargs.dataTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {


    List<Kullanici> kisiler=new ArrayList<>(); // bos list create edildi method bu liste elemt ekleyecek

    public List<Kullanici> kayitAll() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim=scan.nextLine();

        Kullanici k1 = new Kullanici(isim, LocalDateTime.now()); // kullanici class ta pli con ile obj creat ettik

        kisiler.add(k1);

        return kisiler;
    }

    public void sansliKullanici(List<Kullanici>kll){

        for (Kullanici k:kll
             ) {
            if (k.kayitZamani.getSecond()<10){

            }

        }

    }

}
