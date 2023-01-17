package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class c01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int girilenSayi=0;


        while (girilenSayi<1 || girilenSayi>10) {
            try {
                System.out.println("Carpim taplosu olusturmak için bir rakam giriniz");
                girilenSayi=scan.nextInt();
                if (girilenSayi>1 && girilenSayi<10){
                    break;
                }
                System.out.println("carpim tablosu icin bir rakam girmelisiz");
            } catch (InputMismatchException e) {
                System.out.println("carpim tablosu icin bir rakam girmelisiz");
            }
        }

    }
}
