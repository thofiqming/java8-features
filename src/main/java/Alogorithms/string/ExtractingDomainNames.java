package Alogorithms.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingDomainNames {

    public static void main(String[] args) {
        String str = "sfasfdaf http://www.google.comsdahttps://yahoo.comsdafdsf http://www.test.ae";

        Pattern pattern = Pattern.compile("(http[s]?://)(www.)?([a-z]*)(.[com|ae]*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group(3) + matcher.group(4));
        }
    }
}
