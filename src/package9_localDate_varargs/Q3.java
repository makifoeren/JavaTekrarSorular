package package9_localDate_varargs;

import java.time.LocalDate;

public class Q3 {
    public static void main(String[] args) {

    /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        //    LocalDate date = LocalDate.of(2018,Month.FEBRUARY, 29);

        // date.plusDays(2); 2 gün sonrasi
        // date.plisYears(3); 3 yil sonrasi vermesi gerekir fakat atama olmadigi icin degismez

        //    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown. **cevap**
            */

        //Invalid date 'February 29' as '2018' is not a leap year bu yuzden exception verir
        System.out.println(LocalDate.now().isLeapYear());
        //artik yil olup olmadigini belirler boolean sonuc dondurur
        //2022 -> false doner
    }
}
