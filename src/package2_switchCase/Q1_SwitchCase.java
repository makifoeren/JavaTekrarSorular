package package2_switchCase;

import java.util.Scanner;

public class Q1_SwitchCase {

    public static void main(String[] args) {

        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/


        String gün="Sali";

        switch(gün) {
            case "Pazartesi":
            case "Sali" :
                System.out.println("Java dersi günleri");
                break;

            case "Persembe" :
            case "Cuma" :
                System.out.println("Selenyum dersi günleri");
                break;

            case "Carsamba" :
            case "Cumartesi" :
                System.out.println("SQL dersi günleri");
                break;

                default:
                    System.out.println("Tatil gününüz");
        }


    }
}
