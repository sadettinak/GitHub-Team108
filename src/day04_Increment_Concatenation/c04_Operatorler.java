package day04_Increment_Concatenation;

import java.time.LocalDate;

public class c04_Operatorler {
    public static void main(String[] args) {
        int a= 10;
         int b=15;
         boolean c;
        System.out.println(c=a*15==b*10);
        System.out.println(c);
        System.out.println(!true);
        System.out.println(!(a<b));
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getChronology());



    }
}
