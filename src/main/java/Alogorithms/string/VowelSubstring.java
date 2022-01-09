package Alogorithms.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelSubstring {

    public static void main(String[] args) {
        String aeiouia = findSubstring("azerdii", 5);
        System.out.println(aeiouia);
    }

    public static String findSubstring(String str, int k) {

        int i = 0;
        Pattern pattern = Pattern.compile("[aeiou]");
        String result = "Not found!";
        int preCount = 0;
        while (i < str.length() && i + k <= str.length()) {
            String substring = str.substring(i, i + k);
            Matcher matcher = pattern.matcher(substring);
            boolean matchfound = false;
            int count = 0;
            while (matcher.find()) {
                count++;
                matchfound = true;
            }
            if (count > 0 && preCount < count) {
                result = substring;
                preCount = count;
            }
            if (matchfound) {
                i++;
            } else {
                i = i + k;
            }
        }

        return result;
    }
}
