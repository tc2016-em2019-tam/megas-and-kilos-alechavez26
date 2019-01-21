package com.company;

public class MegabyteConverter {
    private int kilobyte;


    public int getKilobyte() {
        return kilobyte;
    }

    public void setKilobyte(int kilobyte) throws Exception {

        if (kilobyte<0) throw new Exception("You can't input negative numbers");
        this.kilobyte = kilobyte;
    }

    public static void PrintMegaBytesAndKiloBytes(int kilobyte){
        int kbyte = kilobyte/1024;
        int remaining = kilobyte%1024;

        if (remaining>0) {
            System.out.println(kilobyte+" KB = "+kbyte+" MB and "+remaining+" KB");
        } else {
            System.out.println(kilobyte+" KB = "+kbyte+" MB");
        }
    }
}