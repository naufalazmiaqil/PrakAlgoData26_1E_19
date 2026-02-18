package Jobsheet1;

import java.util.Scanner;

public class Tugas2_19 {

    public static void Nopaljadwal(String[][] jadwal, int n, Scanner nopal) {

        for (int i = 0; i < n; i++) {
            System.out.println("\njadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = nopal.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = nopal.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = nopal.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = nopal.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {

        System.out.println("\n=== Semua jadwal Kuliah ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n","Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void tampilByHari(String[][] jadwal, int n, String hariCari) {

        System.out.println("\njadwal pada hari " + hariCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
            }
        }
    }

    public static void tampilByMK(String[][] jadwal30, int n, String mkCari30) {

        System.out.println("\njadwal untuk Mata Kuliah " + mkCari30 + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal30[i][0].equalsIgnoreCase(mkCari30)) {
                System.out.println("Ruang : " + jadwal30[i][1]);
                System.out.println("Hari  : " + jadwal30[i][2]);
                System.out.println("Jam   : " + jadwal30[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner nopal = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        
        int n = Integer.parseInt(nopal.nextLine());
        String[][] jadwal = new String[n][4];

        Nopaljadwal(jadwal, n, nopal);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = nopal.nextLine();
        tampilByHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama MK: ");
        String mk = nopal.nextLine();
        tampilByMK(jadwal, n, mk);

        nopal.close();
    }
}