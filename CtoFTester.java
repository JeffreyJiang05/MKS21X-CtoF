/*************************************************

What should the functions have as parameters? 
    functions should have a single parameter
        celsiusToFahrenheit - Double celsius
        fahrenheitToCelsius - Double fahrenheit

What should the function return?
    function should return a double
        celsiusToFahrenheit - returns fahrenheit
        fahrenheitToCelsius - returns celsius

*************************************************/

public class CtoFTester {

    public static void main(String[] args) {
        // Test values - All should be floating point number

        // Celsius to Fahrenheit conversion tests
        // 0 C = 32 F
        System.out.println(celsiusToFahrenheit(0));
        // 45 C = 113 F
        System.out.println(celsiusToFahrenheit(45));
        // -22.5 C = -8.5
        System.out.println(celsiusToFahrenheit(-22.5));


    }

    public static double celsiusToFahrenheit(double celsius) {
        // formula = (C * 9/5) + 32
        double fahrenheit = celsius * 9 / 5 + 32;

        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // stub
        double celsius = 0;

        return celsius;
    }

}