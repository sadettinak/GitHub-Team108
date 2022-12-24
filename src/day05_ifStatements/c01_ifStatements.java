package day05_ifStatements;

import java.util.Scanner;

public class c01_ifStatements {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
    double not=scan.nextDouble();
    if (0<=not && not<50){
        System.out.println("Notunuz DD, maalesef kaldiniz ");

    }
if (50<=not && not<65){
    System.out.println("Notunuz CC, tebrikler gectiniz");
}
  if (65<=not&& not<85){
      System.out.println("Notunuz BB");
  }
  if (85<=not&& not<100){
      System.out.println("Tebrikler notunuz AA");
  }

    }
}
