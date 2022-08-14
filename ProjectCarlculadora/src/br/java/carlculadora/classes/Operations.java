package br.java.carlculadora.classes;

import java.math.BigDecimal;
import java.math.MathContext;

public class Operations {

    private static final MathContext mc = new MathContext(4);

    public static String moreOrLess(String value) {
        try {
            if (value.equals("0")) {

                return value;

            } else {

                return (value.startsWith("-")) ? value.replace("-", "") : "-".concat(value);

            }

        } catch (NumberFormatException ex) {

            return "Inválido";

        }
    }

    public static String add(String a, String b) {
        return new BigDecimal(a).add(new BigDecimal(b), mc).toString();
    }

    public static String subtract(String a, String b) {
        return new BigDecimal(a).subtract(new BigDecimal(b), mc).toString();
    }

    public static String multiply(String a, String b) {
        return new BigDecimal(a).multiply(new BigDecimal(b), mc).toString();
    }

    public static String divide(String x, String y) throws DivideByZeroException {
        if (y.equals("0")) {

            throw new DivideByZeroException();

        } else {

            return new BigDecimal(x).divide(new BigDecimal(y), mc).toString();

        }
    }

    public static String pow(String x, String y) {
        try {

            return new BigDecimal(x).pow(Integer.parseInt(y), mc).toString();

        } catch (Exception ex) {

            return "Inválido";

        }
    }
}
