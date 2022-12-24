package day02_variables_scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi yazin");
        String girilenİsim=scan.nextLine();
        System.out.println(girilenİsim.toUpperCase());
        System.out.println(girilenİsim.toLowerCase());
    }
}
