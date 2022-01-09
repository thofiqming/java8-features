package servian_company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortSentenceWordsByItsLength {

    public static void main(String[] args) {
        String sentence = "Is at of of to in is of the the the the and the the the for the the and also that file into which start these cause stdio ctype these files notice appear header begins proper program program process library getchar putchar contents inserted contains toupper essential functions statements. statements highlighted compilation information functioning preprocessor.";
        String str = Arrays.stream(sentence.split("\\."))
                .map(e -> Arrays.stream(e.split("\\s"))
                        .sorted(Comparator.comparingInt(String::length))
                        .collect(Collectors.joining(" "))).collect(Collectors.joining());
        System.out.println(str);
        System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1));
    }

    //alternate approach
    public static String arrange(String sentence) {
        String[] values = sentence.split("\\s");
        int len = values.length;
        sortString(values, len);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(values[i]).append(" ");
        }
        String str = stringBuilder.toString();
        int i = str.indexOf(".");
        if (i != -1) {
            str = str.replace(".", "").trim() + ".";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    static void sortString(String[] values, int n) {
        for (int i = 1; i < n; i++) {
            String temp = values[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < values[j].length()) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = temp;
        }
    }
}
