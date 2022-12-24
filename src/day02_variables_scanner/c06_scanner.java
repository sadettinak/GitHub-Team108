package day02_variables_scanner;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayiyi giriniz");
double girilenSayi=scan.nextDouble();
        System.out.println("Girilen sayinin karesi :"+girilenSayi*girilenSayi);


    }
}
