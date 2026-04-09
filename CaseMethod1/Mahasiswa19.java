package CaseMethod1;

public class Mahasiswa19 {

    String nama, prodi, nim;

    Mahasiswa19(String nama, String nim, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiwa(){
        System.out.println("NIM : " + nim + " | Nama : " + nama + " | prodi : " + prodi);
    }
}