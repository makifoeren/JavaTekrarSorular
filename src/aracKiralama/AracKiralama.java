package aracKiralama;

public class AracKiralama {

    String model;
    String marka;
    String yakitTipi;
    String vites;
    double gunlukUcret;

    String alacaguGun;
    double alacagiSaat;
    String teslimedecegiGun;
    double teslimedecegiSaat;

    public AracKiralama() {
    }

    public AracKiralama(String model, String marka, String yakitTipi, String vites, double gunlukUcret, double alacagiSaat) {
        this.model = model;
        this.marka = marka;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
        this.alacagiSaat = alacagiSaat;
    }

    public AracKiralama(String alacaguGun, double alacagiSaat, String teslimedecegiGun, double teslimedecegiSaat) {
        this.alacaguGun = alacaguGun;
        this.alacagiSaat = alacagiSaat;
        this.teslimedecegiGun = teslimedecegiGun;
        this.teslimedecegiSaat = teslimedecegiSaat;
    }
}
