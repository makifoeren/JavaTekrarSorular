package sunum;

public class Sekil {


    double uzunKenar;
    double kisaKenar;
    double yaricap;


    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }

    public Sekil() {

    }

    public double cevreHesaplama(){

        return (uzunKenar+kisaKenar)*2;
    }

    public double alanHesaplama(){

        return (uzunKenar*kisaKenar)*2;

    }

    public void cemberCevreHesaplama(){
        System.out.println("Cember'i cevresi : " + (yaricap*2*3.14));
    }

    public void cemberAlanHesaplama(){
        System.out.println("Cember'in alani : " + (yaricap*yaricap*3.14));
    }
}


