package day03_DataCastingmMatematikselİslemler;

public class c05_WrapperClas {
    public static void main(String[] args) {
        String str= "Java Candir";
        String str2="123";
        String str3= "354";
        System.out.println(str2+str3);
        int str2Int=Integer.parseInt(str2);
        int strInt3=  Integer.parseInt(str3);
        System.out.println(str2Int+strInt3);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        char krk1='k';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        System.out.println(Character.isAlphabetic(krk1));
        short sayi3=3;
        int sayi4=4;

    }
}
