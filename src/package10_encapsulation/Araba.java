package package10_encapsulation;

public class Araba { //POJO :planing old java onject---model class

    private String model;
    private  String  renk;
    private int motor;
    private int yil;

    public Araba() { // parametresiz
    }

    public Araba(String model, String renk, int motor, int yil) { //parametreli cons
                                                // buradan obj üretecez
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        //this.yil = yil;
        setMotor(motor); // cons abc cretae etmek icin parametre oarak giren motor datasi
        // setMotor() methodu parametre olarak calisir....

    }

    public Araba(int motor, int yil) { // parametreli
        this.motor = motor;
        this.yil = yil;
    }

    // encapsulated
    /*
    ****pppp
     */

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {

        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("Bu cc de motor mu olur ");
            this.motor=1200;
        }else
        this.motor = motor;
    }

    public int getYil() {

        return yil;
    }

    @Override // bu method bu class tan creat edilen obj field(encapsulated) larini stringe cevirri
    public String toString() { // toString methodu olmazsa ref degeri verir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';

    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("Yanlis yil giridiniz");
        } else
            this.yil = yil;
    }
}
