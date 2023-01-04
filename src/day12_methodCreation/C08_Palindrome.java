package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan
        String str= "1234321";
        String str1= "ey edip adanada pide ye";
        String tersStr= C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("Verilen metin palindrome");
        } else{
            System.out.println("verilen metin palindrome degil");
        }
        String tersStr1= C07_TerseCevirme.metniTerseCevir(str1);
        if (str1.equals(tersStr1)){
            System.out.println("Verilen metin palindrome");
        } else{
            System.out.println("verilen metin palindrome degil");
        }
    }
}
