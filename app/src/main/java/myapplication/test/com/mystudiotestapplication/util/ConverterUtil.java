package myapplication.test.com.mystudiotestapplication.util;

/**
 * Created by someOne on 12/29/2015.
 */
public class ConverterUtil {
    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static int calcSum(int a, int b){

        return a+b;
    }

    public static  int calcSubstraction(int a, int b){

        return a-b;
    }
}
