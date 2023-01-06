package alistirmalar;

import java.util.Scanner;

public class emeklilik_nested {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girin");
        String cinsiyet= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
if (yas<0||yas>90) {
    System.out.println("Yas girisi gecersiz");
}else if (yas<60){

    }else if (cinsiyet.equalsIgnoreCase("Kadin")&&yas>60){
        System.out.println("Emekli olabilirsin");
    }else if (cinsiyet.equalsIgnoreCase("Kadin")&&yas<60){

}
    }
}
