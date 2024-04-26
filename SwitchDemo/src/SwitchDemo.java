package switchdemo;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type in your grade: ");
        String grade = input.nextLine().toUpperCase();

        switch (grade) {
            case "A+":
            case "A":
                System.out.println("Distinction!");
                break;
            case "B":
                System.out.println("Almost there, keep it up!");
                break;
            case "C":
                System.out.println("Try harder, there are many resources online.");
                break;
            default:
                System.out.println("Failed/Wrong grade");
                break;
        }
    }
}