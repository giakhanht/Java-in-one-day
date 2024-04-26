package fordemo;
public class ForDemo {
    public static void main(String[] args) {
        for (int i=0; i<=20; i++) {
            System.out.println(i);
        }

        String[] someArray = {"Yo", "Pierre", "Cuff", "My Hand?"};

        for(int i=0; i< someArray.length; i++) {
            System.out.print(someArray[i] + " ");
        }
        for(String word : someArray) {
            System.out.print(word);
        }
    }
}