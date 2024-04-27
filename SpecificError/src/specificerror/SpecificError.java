package specificerror;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SpecificError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 60, 70};

        System.out.print("Please input the index of the array: ");

        try {
            int choice = input.nextInt();
            System.out.printf("Resulting number from array: numbers[%d] = %d%n", choice, numbers[choice]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is invalid");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Index is not integer");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("--End of Specific Error Handling test---");
        }
    }
}