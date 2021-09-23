/*************************************************

What should the functions have as parameters? 
    functions should have a single parameter
        celsiusToFahrenheit - Double celsius
        fahrenheitToCelsius - Double fahrenheit

What should the function return?
    functions should return a double
        celsiusToFahrenheit - returns fahrenheit
        fahrenheitToCelsius - returns celsius

*************************************************/

public class CtoFTester {

    public static void main(String[] args) {
        // Test values - All should be floating point number

        // Celsius to Fahrenheit conversion tests
        // 0 C = 32 F
        System.out.println("0 C --> " + celsiusToFahrenheit(0) + " F");
        // 45 C = 113 F
        System.out.println("45 C --> " + celsiusToFahrenheit(45) + " F");
        // -22.5 C = -8.5
        System.out.println("-22.5 C --> " + celsiusToFahrenheit(-22.5) + " F");


        // Fahrenheit to Celsius conversion tests
        // 32 F = 0 C
        System.out.println("32 F --> " + fahrenheitToCelsius(32) + " C");
        // 113 F = 45 C
        System.out.println("113 F --> " + fahrenheitToCelsius(113) + " C");
        // -8.5 F - -22.5 C
        System.out.println("-8.5 F --> " + fahrenheitToCelsius(-8.5) + " C");

        // function composition test

        System.out.println("Original is 45: " 
            + fahrenheitToCelsius(celsiusToFahrenheit(45))
        );

        System.out.println("Original is -67: "
            + fahrenheitToCelsius(celsiusToFahrenheit(-67))
        );

    }

    public static double celsiusToFahrenheit(double celsius) {
        // formula = (C * 9/5) + 32
        double fahrenheit = celsius * 9 / 5 + 32;

        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // formula = (F - 32) * 5 / 9
        double celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;
    }

}