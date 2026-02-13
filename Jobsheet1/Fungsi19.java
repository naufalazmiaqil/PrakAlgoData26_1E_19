package Jobsheet1;

public class Fungsi19 {

    static int[] harga = { 75000, 50000, 60000, 10000 };
    
    static int[][] stok = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
        };
    
    static String[] cabang = {
            "ROYAL GARDEN 1",
            "ROYAL GARDEN 2",
            "ROYAL GARDEN 3",
            "ROYAL GARDEN 4"
        };

    public static int hitungPendapatan(int indexCabang) {
        int total = 0;
        
        for (int i = 0; i < harga.length; i++) {
            total += stok[indexCabang][i] * harga[i];
        }
        return total;
    }

    public static void tampilStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status     : Sangat Baik");
            System.out.println("===========================");
        } else {
            System.out.println("Status     : Perlu Evaluasi");
            System.out.println("=========================");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Laporan Pendapatan RoyalGarden ===");
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = hitungPendapatan(i);
            System.out.println("\nCabang     : " + cabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            tampilStatus(pendapatan);
        }
    }
}