package DataTimee;

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

        kisiler.add(k1); // kullanici classdan p li cons ile create edilen obj kisler listesine eklendi

        return kisiler;
    }

    public void sansliKullanici(List<Kullanici>kll){ // kayirAl() methodunda creat edilen her bir kullanici döngüye sokulda

        for (Kullanici k:kll //
             ) {
            if (k.kayitZamani.getSecond()<10){
                System.out.println("Sansli kisisiniz " + k.name + " süpriz hediye kazandiniz...");

            }else System.out.println("Sansli kisi degilsiniz " + k.name + " bir dahaki sefere...");

        }

    }
    public void lsitele(List<Kullanici>kullanicilar){
        for (Kullanici k :kullanicilar) { // kayitAl() methoduyla gelen kisiler lisitini döngüye sokuyor
            System.out.println(" Adi : " + k.name + " kayit zamani : " + k.kayitZamani); //  kisiler listetdeki her bir kullanicinin ad ve kayit zamani
        }
    }

}
