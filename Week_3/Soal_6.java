package Week_3;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal_6 {
    public static void main(String[] args) {
        System.out.println("Masukkan 2 angka dengan maksimal 200 digit dan tidak negatif (dipisah enter spasi):");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        System.out.println("Hasil penjumalahan = " + sum.toString());
        System.out.println("Hasil Hasil perkalian = " + product.toString());
        scanner.close();
    }
}