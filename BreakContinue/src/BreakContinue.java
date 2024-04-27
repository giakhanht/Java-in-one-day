package breakcontinue;
public class BreakContinue {
    public static void main(String[] args) {

        for (int i=0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 7)
                break;
        }
        System.out.println("Finished the Continue demo");

        for (int i=20; i>0; i--) {
            System.out.println("i = " + i);
            if (i % 2 == 0)
                continue;
            System.out.println("Gotcha odd number!!");
        }
    }
}