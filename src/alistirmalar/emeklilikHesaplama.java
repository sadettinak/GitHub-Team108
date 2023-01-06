package alistirmalar;

import java.util.Scanner;

public class emeklilikHesaplama {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girin");
        String cinsiyet= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        if (yas<0 || yas>90) {
            System.out.println("yas girisigecersiz");
        }else if (!(cinsiyet.equalsIgnoreCase("Kadin") ||
                cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet gecersiz");
        }else if (cinsiyet.equalsIgnoreCase("Kadin")&&yas>60){
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet.equalsIgnoreCase("Kadin")&&yas<60){
            System.out.println("Emekli olmak icin"+(60-yas)+"yil daha calisman gerekir");
        }else if (cinsiyet.equalsIgnoreCase("Erkek")&&yas>65){
            System.out.println("Emekli olabilirsin");
        }else if (cinsiyet.equalsIgnoreCase("Erkek")&&yas<=65){
            System.out.println("Emekli olmak icin"+(65-yas)+"yil daha calisman gerekir");
        }
    }
        }


