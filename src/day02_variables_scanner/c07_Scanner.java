package day02_variables_scanner;

import java.util.Scanner;

public class c07_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
    String girilenİsim=scan.nextLine();
        System.out.println("Lutfen soyİsminizi giriniz");
    String girilenSoyisim=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
    int girilenYas=scan.nextInt();
        System.out.println("isminiz:"+girilenİsim.toUpperCase()+
                "\nsoyİsminiz:"+ girilenSoyisim.toUpperCase()+
                "\nyasiniz:"+girilenYas+
                "\nkaydiniz basariyla tamamlanmistir.");

    }
}
