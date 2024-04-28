package objectorienteddemo;
// Different components of a Java class
// Class declare
public class Staff {
    /*
    Variables inside classes are called fields
    AccessModifiers: private (only in-class), package-private, or public
    */
    private String nameOfStaff;
    private final int hourlyRate = 30;
    private int hoursWorked;

    //Methods are ordinary code blocks that perform certain tasks
    public void printMessage() {
        System.out.println("Calculating Pay...");
    }
    /*
    Notice this method declares its own variable staffPay
    staffPay can only be accessed by the method calculatePay() itself
    */
    public int calculatePay() {
        printMessage();

        int staffPay;
        staffPay = hoursWorked * hourlyRate;

        if (hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    /*
    It is possible to create 2 methods of the same name, as long as they have different signatures
    The previous method's signature is calculatePay(), while this method's is calculatePay(int bonus, int allowance)
    bonus and allowance are parameters
    */
    public int calculatePay(int bonus, int allowance) {
        printMessage();

        if (hoursWorked > 0)
            return hoursWorked * hourlyRate + bonus + allowance;
        else
            return 0;
    }

    /*
    Sometimes other classes need to access this class's, Staff, fields
    We use setter and getter methods to greater control what rights other classes have when accessing our (this class's) fields
    */
    public void setHoursWorked(int hours) {
        if (hours > 0)
            hoursWorked = hours;
        else {
            System.out.println("Error: hoursWorked Cannot be Smaller Than 0");
            System.out.println("Error: hoursWorked is not updated");
        }
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    /*
    Constructors are commonly used to initialize fields for the class. (It 'construct' objects from the class template)
    Constructor is the first block of code called when we create an object from our class.
    Constructor doesn't return any value, but we don't have to use 'void' keyword when declaring a constructor
     */
    public Staff(String name) {
        nameOfStaff = name;
        System.out.println("\n" + nameOfStaff);
        System.out.println("--------------------------");
    }
    public Staff(String firstName, String lastName) {
        nameOfStaff = firstName + " " + lastName;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
}
