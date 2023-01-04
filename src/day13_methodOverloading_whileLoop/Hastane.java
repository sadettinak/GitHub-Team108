package day13_methodOverloading_whileLoop;

public class Hastane {
    private String personelIsmi;
    private Object personelTel;

    public static void main(String[] args) {
        String hastaneismi="Yildiz Hastanesi";
        String hastaneAdres="Cankaya/Ankara";
        String adem = new String();
        String personelIsmi =adem;

        String personelAdresi;
        String personelTel;
       
            Hastane p1= new Hastane();
            p1.personelIsmi="Kemal";
            Hastane p3= new Hastane();
            p3.personelTel="3121232323";
        System.out.println((p1)+personelIsmi);
    }
}
