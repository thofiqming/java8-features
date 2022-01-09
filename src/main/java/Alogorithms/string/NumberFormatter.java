package Alogorithms.string;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class NumberFormatter {

    public static void main(String[] args) {

    }

    public static void printWithCountryCurrency(double value) {
        String usValue = NumberFormat.getCurrencyInstance(Locale.US).format(value);
        System.out.println(usValue);
        String inValue = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(value);
        System.out.println(inValue);
        String chValue = NumberFormat.getCurrencyInstance(Locale.CHINA).format(value);
        System.out.println(chValue);
        String frValue = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(value);
        System.out.println(frValue);
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }
}
