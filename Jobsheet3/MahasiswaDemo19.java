package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner nopal = new Scanner(System.in);
        
        Mahasiswa19[] arrayOfMahasiswa = new Mahasiswa19[3];
        
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa19();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = nopal.nextLine();
            
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = nopal.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = nopal.nextLine();

            System.out.print("IPK   : ");
            dummy = nopal.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Data Mahasiswa ke-" + (i+1));
                arrayOfMahasiswa[i].cetakinfo();
            }
    }
}

