package Jobsheet1;

import java.util.Scanner;

public class Pemilihan19 {
    public static void main(String[] args) {
        Scanner nopal = new Scanner(System.in);

        String NilaiHuruf = "";

        int Tugas, Kuis, UTS, UAS;

        System.out.println("Program menghitung Nilai Akhir ");
        System.out.println("===========================");
        System.out.print("Masukkan Nilai Tugas    : ");
        Tugas = nopal.nextInt();
        System.out.print("Masukkan Nilai kuis     : ");
        Kuis = nopal.nextInt();
        System.out.print("Masukkan Nilai UTS      : ");
        UTS = nopal.nextInt();
        System.out.print("Masukkan Nilai UAS      : ");
        UAS = nopal.nextInt();
        System.out.println("===========================");

        if (Tugas > 100 || Kuis > 100 || UTS > 100 || UAS > 100 || Tugas < 0 || Kuis < 0 || UTS < 0 || UAS < 0) {
            System.out.println("===========================");
            System.out.println("Nilai tidak valid");
            System.out.println("===========================");
        } else {
            Double NilaiAkhir = (Tugas * 0.2) + (Kuis*0.2) + (UTS*0.3) + (UAS*0.3);
            
            if (NilaiAkhir > 80) {
                NilaiHuruf = "A";
            }else if (NilaiAkhir >= 73) {
                NilaiHuruf = "B+";
            }else if (NilaiAkhir >= 65) {
                NilaiHuruf = "B";
            }else if (NilaiAkhir >= 60) {
                NilaiHuruf = "C+";
            }else if (NilaiAkhir >= 50) {
                NilaiHuruf = "C";
            }else if (NilaiAkhir >= 39) {
                NilaiHuruf = "D";
            }else if (NilaiAkhir >= 73) {
                NilaiHuruf = "E";
            }
            
            System.out.println("===========================");
            System.out.println("Nilai Akhir     : " + NilaiAkhir);
            System.out.println("Nilai Huruf     : " + NilaiHuruf);
    }
}
}
