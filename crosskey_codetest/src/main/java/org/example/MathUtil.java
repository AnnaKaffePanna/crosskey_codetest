package org.example;

public class MathUtil {
    public static double roundUp(final double number){
        return (int)((number * 10.0) + 0.5) / 10.0;
    }

    public static double ownPow(final double base, final int exponent) {
        double ans = 1; // if the exponent is 0 one will be the default answer

        if (exponent != 0) {
            int absExponent = exponent > 0 ? exponent : (-1) * exponent;
            for (int i = 1; i <= absExponent; i++) {
                ans *= base;
            }

            if (exponent < 0) {
                // Negative exponents are inverted
                ans = 1.0 / ans;
            }
        }
        return ans;
    }
}
