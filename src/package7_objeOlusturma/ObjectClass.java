package package7_objeOlusturma;

public class ObjectClass {

    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */

    public static void main(String[] args) {

        ÖgretmenBilgileri obj1=new ÖgretmenBilgileri();
        obj1.isim="Ali";
        obj1.soyisim="Veli";
        obj1.yas=34;
        obj1.brans="Kimya";
        obj1.tel="1234456";

        ÖgretmenBilgileri obj2=new ÖgretmenBilgileri();
        obj2.isim="Canan";
        obj2.soyisim="Can";
        obj2.yas=42;
        obj2.brans="Mat";
        obj2.tel="238890";

        System.out.println(obj1.isim +" "+obj1.soyisim+", "+obj1.yas +", "+obj1.brans+", "+obj1.tel);
        System.out.println(obj2.isim +" "+obj2.soyisim+", "+obj2.yas +", "+obj2.brans+", "+obj2.tel);

    }

}
