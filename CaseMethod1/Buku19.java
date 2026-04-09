package CaseMethod1;

public class Buku19 {
    
    String kodebuku, judul;
    int tahunterbit;

    Buku19(String kodebuku, String judul, int tahunterbit){
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.tahunterbit = tahunterbit;
    }

    void tampilbuku(){
        System.out.println("Kode : " + kodebuku + " | Judul : " + judul + " | Tahun : " + tahunterbit);
    }
}
