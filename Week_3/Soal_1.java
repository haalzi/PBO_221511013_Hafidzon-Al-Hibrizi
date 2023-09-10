package Week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        Pattern pola = Pattern.compile("[A-Za-z]+");
        Matcher cocok = pola.matcher(kalimat);
        List<String> tokens = new ArrayList<>();
        while (cocok.find()) {
            tokens.add(cocok.group());
        }
        System.out.println(tokens.size());
        for (String token : tokens) {
            System.out.println(token);
        }
        input.close();
    }
}