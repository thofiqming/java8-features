package Alogorithms.string;

public class AdjacentCharacterMatching {

    public static void main(String[] args) {
        String str = "AAABABCDDCBAAA";
        int i = 0, j = 2;
        while (i < str.length() && j <= str.length()) {
            String substring = str.substring(i, j);
            if (substring.equals("AB") || substring.equals("BA") || substring.equals("CD") || substring.equals("DC")) {
                str = str.substring(0, i) + str.substring(j);
            } else {
                i++;
                j++;
            }
        }

        System.out.println(str);
    }
}
