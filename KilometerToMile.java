import java.util.Scanner;

class KilometerToMile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Program for converting Convert Kilometers to Miles");
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

    }
}
