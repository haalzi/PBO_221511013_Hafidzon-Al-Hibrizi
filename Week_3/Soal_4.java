package Week_3;

import java.util.Scanner;

public class Soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan penjualan bulan ini: ");
        int totPenjualan = input.nextInt();
        int gajiPokok = 500000;
        int hargaItem = 50000;
        double bonus = 0;
        if (totPenjualan >= 40 && totPenjualan <= 80) 
        {
            bonus = totPenjualan * hargaItem * 0.25;
        } 
        else if (totPenjualan > 80) 
        {
            bonus = totPenjualan * hargaItem * 0.35;
        } 
        else if (totPenjualan < 15) 
        {
            int penjualanMin = 15 - totPenjualan;
            bonus = -penjualanMin * hargaItem * 0.15;
        } 
        else 
        {
            bonus = totPenjualan * hargaItem * 0.10;
        }
        int Gaji = (int) (gajiPokok + bonus);
        System.out.println("Gaji yang diterima pegawai: " + Gaji);

        input.close();
    }
}