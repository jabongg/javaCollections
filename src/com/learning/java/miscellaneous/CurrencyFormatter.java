package com.learning.java.miscellaneous;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.text.*;

/**
 * Created by ejangpa on 2/5/2017.
 */
public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double currencyAmount = scanner.nextDouble();

        NumberFormat numberFormatFRENCH = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatUK = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat numberFormatCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println(Locale.FRENCH.getDisplayName() + ", " + numberFormatFRENCH.format(currencyAmount));
        System.out.println(Locale.US.getDisplayName() + ", " + numberFormatUS.format(currencyAmount));
        System.out.println(Locale.UK.getDisplayName() + ", " + numberFormatUK.format(currencyAmount));
        System.out.println(Locale.CHINA.getDisplayName() + ", " + numberFormatCHINA.format(currencyAmount));

        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String currencyAmountIndia = formatter.format(currencyAmount);
        System.out.println(currencyAmountIndia);
    }
}
