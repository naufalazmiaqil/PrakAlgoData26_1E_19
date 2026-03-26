package Kuis1;

import java.util.Scanner;

public class SmartHomeMain {
    public static void main(String[] args) {
        Scanner nopal = new Scanner(System.in);

        String nama;
        double konsumsipower, standbypower;

        System.out.print("masukkan berapa device  : ");
        int n = nopal.nextInt();
        nopal.nextLine();

        SmartHomeDevice [] device = new SmartHomeDevice[n];

        for (int i = 0; i < device.length; i++) {
            System.out.println("device ke-" + (i+1));

            System.out.println("=====================");

            System.out.print("nama            : ");
            nama = nopal.nextLine();

            System.out.print("konsumsi power  : ");
            konsumsipower = nopal.nextDouble();

            System.out.print("stand by power  : ");
            standbypower = nopal.nextDouble();
            nopal.nextLine();
            
            device[i] = new SmartHomeDevice(nama, konsumsipower, standbypower);
        }

        for (int i = 0; i < n; i++) {
            device[i].printdata();
        }

        System.out.println("======================");
        System.out.println("device paling efisien");
        System.out.println("----------------------");

        double total = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (device[i].totalenergiaktual() > 10) {
                total += device[i].totalenergiaktual();
                count++;
            }
        }

        double rata;
        if (count > 0) {
            rata = total / count;
            System.out.println("rata rata total energi (power > 10) adalah" + rata);
        }else{
            System.out.println("tidak ada device yang konsumsi powernya melebihi 10 ");
        }
    }
    
}
