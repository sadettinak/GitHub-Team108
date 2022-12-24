package day02_variables_scanner;

import java.util.Scanner;

public class c10_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir double sayi girin");
        double sayiDbl=scan.nextDouble();
        System.out.println("Lutfen bir tamsayi girin");
        int sayiİnt=scan.nextInt();
        System.out.println("Sayilarin toplami:"+(sayiDbl+sayiİnt));
        System.out.println("Sayilarin carpimi:"+sayiDbl*sayiİnt);

    }
}
