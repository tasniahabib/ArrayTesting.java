
import java.util.Random;

public class ArrayTesting {
    public static void main(String[] args) {

        // Program 1: Declare an integer array
        int[] dataPoints = new int[50];

        Random rnd = new Random();

        // Program 2: Fill the array with random numbers from 1 to 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Program 3: Display the array values separated by |
        System.out.println("The random values in dataPoints are:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Program 4: Calculate the sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);

        System.out.println("The average of the random array dataPoints is: " + average);
    }
}
