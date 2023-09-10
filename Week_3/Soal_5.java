package Week_3;

import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        System.out.println("Masukkan plat 4 mobil (dipisah dengan spasi):");
        Scanner input = new Scanner(System.in);
        String mbl_1,mbl_2,mbl_3,mbl_4;
        String mbltot = null;
        mbl_1 = input.next();
        mbl_2 = input.next();
        mbl_3 = input.next();
        mbl_4 = input.next();
        mbltot = mbl_1+mbl_2+mbl_3+mbl_4;
        input.close();
        if((Double.parseDouble(mbltot) - 999999) % 5 == 0)
        {
            System.out.println("Jalan");
        }
        else 
        {
            System.out.println("Berhenti");
        }
    }
}