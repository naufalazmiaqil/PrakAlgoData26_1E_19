package CaseMethod1;

public class Peminjaman19 {

    Mahasiswa19 mhs;
    Buku19 buku;
    int lamapinjam, bataspinjam = 5, terlambat, denda;

    Peminjaman19(Mahasiswa19 mhs, Buku19 buku,int lamapinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamapinjam = lamapinjam;
        hitungDenda();
    }

    void hitungDenda(){
        int bataspinjam = 5;
        if (lamapinjam > bataspinjam) {
            terlambat = lamapinjam - bataspinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman(){ 
        System.out.println(mhs.nama + " | " + buku.judul + " | lama : " + lamapinjam + " | Terlmbat : " + terlambat + " | Denda : " + denda);
    }
    
}
