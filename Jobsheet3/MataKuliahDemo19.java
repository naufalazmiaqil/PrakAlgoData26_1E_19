package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo19 {
    public static void main(String[] args) {
        
    Scanner nopal = new Scanner(System.in);

    MataKuliah19[] arrayofMataKuliah19 = new MataKuliah19[3];

    String kode, nama, ruang, dummy;
    int sks, jumlahjam;

    for(int i = 0; i < 3; i++){
        System.out.println("Masukkan Data Kuliah ke-" + (i+1));
        System.out.print("kode          : ");
        kode = nopal.nextLine();

        System.out.print("Nama          : ");
        nama = nopal.nextLine();

        System.out.print("SKS           : ");
        dummy = nopal.nextLine();   
        sks = Integer.parseInt(dummy);

        System.out.print("Jumlah Jam    : ");
        dummy = nopal.nextLine();
        jumlahjam = Integer.parseInt(dummy);

        System.out.print("Ruang         : ");
        ruang = nopal.nextLine();
        System.out.println("-----------------------");

        arrayofMataKuliah19[i] = new MataKuliah19(kode, nama, sks, jumlahjam);
        arrayofMataKuliah19[i].tambahdata(ruang);
    }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Kuliah ke-" + (i+1));
            arrayofMataKuliah19[i].cetakinfo();
            }
    }
}

