package day03_DataCastingmMatematikselİslemler;

import java.util.Scanner;

public class c06_DataCasting {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir double sayi giriniz");
        double sayiDbl=scan.nextDouble();
        System.out.println("lutfen bir tamsayi giriniz");
        int sayiInt= scan.nextInt();
        System.out.println((int)(sayiDbl/sayiInt));
    }
}
