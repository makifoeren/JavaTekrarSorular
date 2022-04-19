package package10_encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda=new Araba(); // parametresiz
        // paramertesiz olunca bu sekilde elle aliyorsun
        honda.setModel("Accord");
        honda.setMotor(1600);
        honda.setYil(-2018);

        honda.setRenk("Kirmizi");
        Araba toyota=new Araba("Avensis","Beyaz",300,-2020);
        Araba volvo=new Araba("s80","Mavi",2400,2010);
        Araba haciMurat=new Araba(400,1974);

        System.out.println(honda); // toString methodu olmazsa ref degeri verir
        System.out.println("Sectiginiz arac : "+ volvo); // toString methodu olmazsa ref degeri verir
        System.out.println("SECTIGIMIZ ARAC TOYOTA :"  + "MODELI :" + toyota.getModel() +
                " RENK :" + toyota.getRenk() + " MOTOR : " + toyota.getMotor() + " YIL : " + toyota.getYil());



    }
}
