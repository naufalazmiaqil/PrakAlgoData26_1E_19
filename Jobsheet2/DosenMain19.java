package Jobsheet2;

public class DosenMain19 {
    public static void main(String[] args) {
        
        Dosen19 dosen1 = new Dosen19("1234567", "LG Adama vito", true, 2015, "Basis Data");
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Alabar Linear");
        dosen1.tampilInformasi();

        Dosen19 dosen2 = new Dosen19("7654321", "Naufal Azmi Aqil", false, 2017, "Aljabar Linear");
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Basis Data");
        dosen2.tampilInformasi();

    }
    
}
