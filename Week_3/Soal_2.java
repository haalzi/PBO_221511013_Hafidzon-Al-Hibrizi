package Week_3;

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        System.out.println("Masukkan isi string (contoh : abc 123):");
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] space = line.split(" ");

            if (space.length == 2) {
                String str = space[0];
                int num = Integer.parseInt(space[1]);
                String formattedString = String.format("%-10s%03d", str, num);
                System.out.println(formattedString);
            }
        }
        input.close();
    }
}