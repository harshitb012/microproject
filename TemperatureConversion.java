import java.util.Scanner;

public class TemperatureConversion {

    // Conversion methods
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }

    // Main logic
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        try {
            System.out.print("Enter the temperature value: ");
            double value = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter the unit (Celsius, Fahrenheit, Kelvin): ");
            String unit = scanner.nextLine().trim().toLowerCase();

            switch (unit) {
                case "celsius":
                case "c":
                    double fFromC = celsiusToFahrenheit(value);
                    double kFromC = celsiusToKelvin(value);
                    System.out.printf("%.2f°C is %.2f°F and %.2fK%n", value, fFromC, kFromC);
                    break;
                case "fahrenheit":
                case "f":
                    double cFromF = fahrenheitToCelsius(value);
                    double kFromF = fahrenheitToKelvin(value);
                    System.out.printf("%.2f°F is %.2f°C and %.2fK%n", value, cFromF, kFromF);
                    break;
                case "kelvin":
                case "k":
                    double cFromK = kelvinToCelsius(value);
                    double fFromK = kelvinToFahrenheit(value);
                    System.out.printf("%.2fK is %.2f°C and %.2f°F%n", value, cFromK, fFromK);
                    break;
                default:
                    System.out.println("Invalid unit. Please enter Celsius, Fahrenheit, or Kelvin.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric temperature value.");
        }

        scanner.close();
    }
}
