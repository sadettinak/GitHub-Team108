package day14_doWhileLoop_scope;

public class C05_Scope {
    public static void main(String[] args) {
        int sayi=10;


            String mainStr="Java";
        System.out.println(mainStr);
            // sayi=20;
            // System.out.println(method2Str);
            for (int i = 0; i < 10; i++) {
                int toplam= i;
            }
            //System.out.println(toplam);
            //System.out.println(i);
            //static int mainSayi=29;
        }
        public static void method1(){
            String method1Str="Guzeldir";
            int number = 10;
            //sayi=14;
            // System.out.println(mainStr);
            // System.out.println(method2Str);
        }
        public void method2(){
            String method2Str=" javaCandir";
            int number = 30;
            int sayi = 30;
            // System.out.println(method2Str);
    }
}
