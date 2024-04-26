package ifdemo;
import java.util.Scanner;
public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nPlease input your age:");
        int userAge = input.nextInt();

        if (userAge <= 0 || userAge >= 100)
            System.out.println("Invalid age for this service");
        else if (userAge < 18)
            System.out.println("You are underage");
        else
            System.out.println("Please continue signing up");
    }
}