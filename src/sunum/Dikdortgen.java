package sunum;

public class Dikdortgen extends Sekil{

    public Dikdortgen(){

    }
    public Dikdortgen(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Dikdortgen ; " +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                " Alani : " + alanHesaplama() +
                " Cevresi : " + cevreHesaplama() ;
    }
}
