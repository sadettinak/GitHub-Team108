package day02_variables_scanner;

import java.util.Scanner;

public class c09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1'i girin");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen sayi2'i girin");
        int sayi2=scan.nextInt();
        int temp = sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("sayilarin yrini degistirdim" +
                "\nsayi1'in yeni degeri:"+sayi1
        + "\nsayi2'nin yeni degeri:"+sayi2);
        
    }
}
