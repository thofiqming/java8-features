package Alogorithms.string;

public class CountRequiredAdjacentCharDeletion {

    public static void main(String[] args) {
        String str = "ABBA";
        int i = 0;
        int j = i + 1;
        int count = 0;
        while (i < str.length() && j < str.length()) {
            char current = str.charAt(i);
            if (current == str.charAt(j)) {
                count = count + 1;
            }
            i++;
            j++;
        }

        System.out.println(count);
    }
}
