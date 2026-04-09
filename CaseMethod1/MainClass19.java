package CaseMethod1;

import java.util.Scanner;

public class MainClass19 {
    public static void main(String[] args) {
        Scanner nopal = new Scanner(System.in);

        Mahasiswa19 m1 = new Mahasiswa19("Andi", "22001", "Teknik Informatika");
        Mahasiswa19 m2 = new Mahasiswa19("Budi", "22002", "Teknik Informatika");
        Mahasiswa19 m3 = new Mahasiswa19("Citra", "22003", "Sistem Informasi Bisnis");

        Buku19 b1 = new Buku19("B001", "Algoritma", 2020);
        Buku19 b2 = new Buku19("B002", "Basis Data", 2019);
        Buku19 b3 = new Buku19("B003", "Pemrograman", 2021);
        Buku19 b4 = new Buku19("B004", "Fisika", 2024);

        Peminjaman19[] p = {
                new Peminjaman19(m1, b1, 7),
                new Peminjaman19(m2, b2, 3),
                new Peminjaman19(m3, b3, 10),
                new Peminjaman19(m3, b4, 6),
                new Peminjaman19(m1, b2, 4)
        };

        int pilih;
        do {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku ");
        System.out.println("3. Tampilkan Peminjaman ");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.println("========================================");
        
        System.out.print("Pilih : ");
        pilih = nopal.nextInt();
        System.out.println("----------------------------------------");

        switch (pilih) {
            case 1:
                m1.tampilMahasiwa();
                m2.tampilMahasiwa();
                m3.tampilMahasiwa();
                System.out.println("----------------------------------------");
                break;
            
            case 2:
                b1.tampilbuku();
                b2.tampilbuku();
                b3.tampilbuku();
                b4.tampilbuku();
                System.out.println("----------------------------------------");
                break;

            case 3:
                System.out.println("Data peminjam   : ");
                for (Peminjaman19 x : p) {
                        x.tampilPeminjaman();
                    }
                break;
            
            case 4:
                for (int i = 0; i < p.length - 1; i++) {
                        for (int j = 0; j < p.length - i - 1; j++) {
                            if (p[j].denda < p[j + 1].denda) {
                                Peminjaman19 temp = p[j];
                                p[j] = p[j + 1];
                                p[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (Peminjaman19 x : p) {
                        x.tampilPeminjaman();
                    }
                    System.out.println("----------------------------------------");
                break;

            case 5:
                System.out.print("Masukkan NIM : ");
                    String cari = nopal.next();

                    boolean ketemu = false;
                    for (Peminjaman19 x : p) {
                        if (x.mhs.nim.equals(cari)) {
                            x.tampilPeminjaman();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    System.out.println("----------------------------------------");
            break;
        }
        } while (pilih!= 0);
    }
    
}
