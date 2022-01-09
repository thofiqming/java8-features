package circlescompany;

public class CountPalindromeString {

    public static void main(String[] args) {
        String str = "aaa";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (str.substring(i, j).equals(new StringBuilder(str.substring(i, j)).reverse().toString())){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
