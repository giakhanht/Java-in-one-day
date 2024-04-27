package errordemo;
import java.util.Scanner;
public class ErrorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please enter the numerator: ");
            float numerator = input.nextFloat();
            System.out.print("Please enter the denominator: ");
            float denominator = input.nextFloat();

            float result = numerator/denominator;

            System.out.printf("Result of the division: %.2f\n",result);

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("---End of Error Handling demo---");
        }
    }
}