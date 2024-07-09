import java.util.ArrayList;
import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>(Arrays.asList(3.5, 7.2, 1.8, 9.1, 4.6, 2.3, 6.7, 5.4));
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.size();
        System.out.println("The average is: " + average);
    }
}