package day04_Increment_Concatenation;

public class c02_Pre_PostIncrement {
    public static void main(String[] args) {
        int a=1;
        int b=a++;
        int c=++a;
        System.out.println(a+","+b+","+c);
        int x=20;
        int y=++x;
        int z=y++;
        System.out.println(x+","+y+","+z);
        int k=30 ;
        System.out.print(k++);
        System.out.print(++k);
        System.out.print(k++);
        System.out.print(k);
        int sayi1=40;
        int sayi2=sayi1++;
        int sayi3=--sayi2;
        int sayi4= --sayi1;
        System.out.println(sayi1+","+sayi2+","+sayi3+","+sayi4);
    }
}
