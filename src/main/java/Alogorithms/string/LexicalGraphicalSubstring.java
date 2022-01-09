package Alogorithms.string;

public class LexicalGraphicalSubstring {


    public static void main(String[] args) {

        String str1 = new String("acbacbc");
        String mx = "";
        for (int i = 0; i < str1.length(); i++) {
            if (mx.compareTo(str1.substring(i)) <= 0) {
                mx = str1.substring(i);
            }
        }
        System.out.println(mx);
    }
}
