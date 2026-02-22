package Jobsheet2;

public class MataKuliahMain19 {
    
    public static void main(String[] args) {
        
        MataKuliah19 matkul1 = new MataKuliah19("PASD", "Praktikum Algoritma dan Struktur Data",2, 4);
        matkul1.ubahSKS(3);
        matkul1.tambahjam(2);
        matkul1.kurangiJam(0);
        matkul1.tampilInformasi();

        MataKuliah19 matkul2 = new MataKuliah19("BD", "Basis Data", 1, 5);
        matkul2.ubahSKS(2);
        matkul2.tambahjam(0);
        matkul2.kurangiJam(1);
        matkul2.tampilInformasi();
    }
}
