package util;

public class CurrencyConverter {
    public static final double IOF_PERCENTAGE = 6.0;

    public static double amountPaid(double quantityBought, double dollarPrice) {
        return quantityBought * dollarPrice * (1 + IOF_PERCENTAGE / 100);
    }
}
