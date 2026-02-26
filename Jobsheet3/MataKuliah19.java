package Jobsheet3;

public class MataKuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;
    public String ruang;

    public MataKuliah19(String kode, String nama, int sks, int jumlahjam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }  
    
    void tambahdata(String ruang){
        this.ruang = ruang;
    }

    public void cetakinfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahjam);
        System.out.println("Ruang       : " + ruang);
    }
}