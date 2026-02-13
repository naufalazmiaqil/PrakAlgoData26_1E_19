package Jobsheet1;

import java.util.Scanner;

public class Array19{

    public static void main(String[] args) {
        Scanner nopal = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        int jumlahMK = 8;
        String[] namaMK = { "Pancasila", 
                            "Konsep Teknologi Informasi", 
                            "Critical Thinking dan Problem Solving",
                            "Matematika Dasar", 
                            "Bahasa Inggris", 
                            "Dasar Pemrograman", 
                            "Praktikum Dasar Pemrograman",
                            "Keselamatan dan Kesehatan Kerja" };
        
        int[] sks = new int[jumlahMK];
        
        double[] nilaiAngka = new double[jumlahMK];

        String[] nilaiHuruf = new String[jumlahMK];
        
        double[] nilaiSetara = new double[jumlahMK];
        
        double totalBobot = 0;
        
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + (namaMK[i]) + " : ");
            nilaiAngka[i] = nopal.nextDouble();
            System.out.print("Bobot SKS                               : ");
            sks[i] = nopal.nextInt();
            nopal.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

        totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
            System.out.println("-------------------------------");
        }
        double ip = totalBobot / totalSKS;
        System.out.println("====================================================================================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("====================================================================================");
        System.out.printf("%-37s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("====================================================================================");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-37s %-12.2f %-12s %-12.2f\n",
                    namaMK[i],
                    nilaiAngka[i],
                    nilaiHuruf[i],
                    nilaiSetara[i]);
        }
        System.out.println("==============================================================");
        System.out.printf("IP Semester : %.2f\n", ip);
        System.out.println("==============================================================");
        nopal.close();
    }
}
 
