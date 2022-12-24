package day02_variables_scanner;

import java.util.Scanner;

public class c08_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzunlugunu girin");
   double kenar1=scan.nextDouble();
   double kenar2=scan.nextDouble();
        System.out.println("Dikdortgenin alani:"+kenar2*kenar1);
   }



}
