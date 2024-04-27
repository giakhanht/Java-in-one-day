package throwingexceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ThrowingExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] luckBox = {3,5,7,9,1,10};

        try {
            System.out.print("Please enter your mystery card number, 0 to 5: ");
            int choice = input.nextInt();
            if (choice==4)
                throw new ArrayIndexOutOfBoundsException();
            System.out.printf("You mystery number is: %d%n", luckBox[choice]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index invalid (or I saved you from low score)");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Index is not integer");
        }
        finally {
            System.out.println("---End of Throwing Exception test---");
        }

    }
}