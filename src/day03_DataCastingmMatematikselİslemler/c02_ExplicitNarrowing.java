package day03_DataCastingmMatematikselİslemler;

public class c02_ExplicitNarrowing {
    public static void main(String[] args) {


        double dbl=21.5;
        int sayi=(int)dbl;
        System.out.println(sayi);
        byte byt=(byte)sayi;
        System.out.println(byt);
        sayi=13;
        System.out.println(byt);
    }
}
