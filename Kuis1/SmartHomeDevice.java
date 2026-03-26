package Kuis1;

public class SmartHomeDevice {
    public String nama;
    public double konsumsipower;
    public double standbypower;

    public SmartHomeDevice (String nama, double konsumsipower, double standbypower){
        this.nama = nama;
        this.konsumsipower = konsumsipower;
        this.standbypower = standbypower;
    }

    public double totalenergiaktual(){
        return konsumsipower + standbypower;
    }

    public double rasioefisiensi(){
        return (standbypower/totalenergiaktual())*100;
    }

    void printdata(){
        System.out.println("nama            : " + nama);
        System.out.println("konsumsi power  : " + konsumsipower);
        System.out.println("stand by power  : " + standbypower);
        System.out.println("=======================");
        System.out.println("total energi aktual : " + totalenergiaktual());
        System.out.println("rasio efisiensi     : " + rasioefisiensi());
    }
}
