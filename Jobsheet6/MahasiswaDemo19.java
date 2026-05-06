package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("-----------------------------");

            list.tambah(new Mahasiswa19(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("=================================");
        System.out.println("Pencarian Data (Sequential)");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        System.out.println("=================================");
        System.out.println("Pencarian Data (Binary)");
        System.out.print("Masukkan IPK yang dicari: ");
        cari = sc.nextDouble();

        posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
