package Jobsheet2;

public class Dosen19 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangkeahlian;

    public Dosen19(String id, String nm,  boolean statusbaru, int tahunbergabung,String bidangKeahlian){
        this.idDosen = id;
        this.nama = nm;
        this.statusAktif = statusbaru;
        this.tahunBergabung = tahunbergabung;
        this.bidangkeahlian = bidangKeahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif? "aktif" : "Tidak aktif" ));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangkeahlian);
        System.out.println("=======================================");
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangkeahlian = bidang;
    }
    
}
