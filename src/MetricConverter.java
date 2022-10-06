import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        //Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and
        // inches. Again, check for valid input and exit with an error msg if you don’t get it. Testing: use some known
        // values here and watch for integer truncation.

        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your measurement in meters");
        if (scanner.hasNextDouble()){
            meters = scanner.nextDouble();
            scanner.nextLine();
        }
        else {
            trash = scanner.nextLine();
            System.out.println("The value that you entered is invalid please try again " + trash);
            System.exit(0);
        }

        miles = meters * 0.00062;
        System.out.println("Your value in miles is " + miles);

        feet = meters * 3.2808;
        System.out.println("Your value in feet is" + feet);

        inches = meters * 39.370;
        System.out.println("Your value in inches is" + inches);

    }
}
