package Week_2;

import java.util.Scanner;

public class Soal_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String A = Input.nextLine();
        String B = Input.nextLine();
        int sumOfLengths = A.length() + B.length();
        String result = (A.compareTo(B) > 0) ? "Yes" : "No";
        A = Kapitalisasi(A);
        B = Kapitalisasi(B);
        System.out.println(sumOfLengths);
        System.out.println(result);
        System.out.println(A + " " + B);
        Input.close();
    }
    public static String Kapitalisasi(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}