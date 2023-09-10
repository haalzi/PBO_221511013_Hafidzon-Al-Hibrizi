package Week_3;

import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan perhitungan (Harus terpisah dengan spasi):");
        String count = input.nextLine();

        String[] space = count.split(" ");
        int A = Integer.parseInt(space[0]);
        char operator = space[1].charAt(0);
        int B = Integer.parseInt(space[2]);
        int result = 0;
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }
        System.out.println("Hasilnya: " + result);

        input.close();
    }
}