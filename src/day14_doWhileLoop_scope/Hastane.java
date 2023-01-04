package day14_doWhileLoop_scope;

public class Hastane {
    private String personelIsmi;
    private String personelTel;

    public static void main(String[] args) {
        String hastaneismi="Yildiz Hastanesi";
        String hastaneAdres="Cankaya/Ankara";

        String personelIsmi;
        String personelAdresi;
        String personelTel;

            Hastane p1= new Hastane();
            p1.personelIsmi="Kemal";


            Hastane p3= new Hastane();
            p3.personelTel="3121232323";
    }
}
