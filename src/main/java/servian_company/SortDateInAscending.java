package servian_company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SortDateInAscending {

    public static void main(String[] args) throws ParseException {
        List<String> strings = sortDates(Arrays.asList("01 Mar 2017", "03 Feb 2017"));
        System.out.println(strings);
    }


    public static List<String> sortDates(List<String> dates) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");

        return dates.stream().map(source -> {
            try {
                return simpleDateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }).sorted().map(simpleDateFormat::format).collect(Collectors.toList());

    }
}
