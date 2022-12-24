package day03_DataCastingmMatematikselİslemler;

import java.util.Scanner;

public class c04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println((char)'a'-32);
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
    char girilenKarakter=scan.next().charAt(0);
        System.out.println((char)(girilenKarakter+1)+" "+
               ( char) (girilenKarakter+2)+" "+
                (char) (girilenKarakter+3)
                );
    }
}
