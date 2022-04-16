package package6_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject {

    static List<String> günler =new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double> günlükKazanclar= new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static double ciro=0;

    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {

        int gün=0;
        while(gün<7){
            System.out.print(günler.get(gün) + " gününün kazanzicini giriniz : ");
            double günlükhasilat=scan.nextDouble();
            günlükKazanclar.add(günlükhasilat);
            ciro+=günlükhasilat;
            gün++;
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
        System.out.println("Günlük kazanclar = " + günlükKazanclar);
        System.out.println("Haftanin toplam kazanci = " + ciro);
        System.out.println("Haftalik ortalama kazanc = " + getOrtalamaKazanc());
        System.out.println("Ortalama üstü kazanc saglana gün = " + getOrtalamaninUstundeKazancGünleri() );
        System.out.println("Ortalama alti kazanc saglana gün = " + getOrtalamaninAltindaKazancGünleri() );

    }

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAltiGün="";
        for(int i=0; i<günlükKazanclar.size(); i++){
            if (günlükKazanclar.get(i)<getOrtalamaKazanc()){
                ortalamaAltiGün+=günler.get(i);
            }
        }

        return ortalamaAltiGün;

    }

    private static String getOrtalamaninUstundeKazancGünleri() {
        
        String ortalamaÜstüGün="";
        for(int i=0; i<günlükKazanclar.size(); i++){
            if (günlükKazanclar.get(i)>getOrtalamaKazanc()){
                ortalamaÜstüGün+=günler.get(i);
            }
        }
        
        return ortalamaÜstüGün;
    }

    private static double getOrtalamaKazanc() {
        double ortalamaKazanc = ciro/7;
        
     return ortalamaKazanc;   
    }
}
