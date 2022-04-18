package teamSorulari;

public class sekil {


public class Sekil {

    /*
    inctance variable larin ve method larin oldugu class
    kare        ==> "double kenarUzunlugu"                                   cm olarak
         dikdortgen  ==> "double KenarUzunlugu" ve "double uzunKenarUzunlugu"         ""
         cember      ==> "double yaricap"  "double piSayisi=3.14"                     ""

            case 1:
                //kareIslemleri();
                break;
            case 2:
               // dikdörtgenIslemleri();
                break;
            case 3:
               // cemberIslemleri();
                break;---
     */

    double kenarUzunlugu;
    double uzunKenarUzunlugu;
    double yaricap;

    public double kareIslemleri() {
        double kareAlani=(kenarUzunlugu*kenarUzunlugu);
        double kareninCevresi=(4*kenarUzunlugu);

        return kenarUzunlugu*kenarUzunlugu;  // bunu cevresi icinde ayrica yapmamiz gerekiyor eger
        // öyel olursa iki farkli method yazmaliyiz
        // buda runner class ta iki farkli kare islemleri gerektiri
        //AYNI DURUM DIGERLERI ICINDE GECERLIDIR

    }

    public double dikdörtgenIslemleri(){
        double dikdörtgeninAlani=(kenarUzunlugu*uzunKenarUzunlugu);
        double dikdörtgeninCevresi=(kenarUzunlugu+uzunKenarUzunlugu)*2;

        return kenarUzunlugu+uzunKenarUzunlugu;

    }

    public double cemberIslemleri(){
        double cemberinAlani=(yaricap*yaricap)*3.14;
        double cemberinCevresi=(yaricap*3.14*2);

        return yaricap*yaricap;
    }

}


}
