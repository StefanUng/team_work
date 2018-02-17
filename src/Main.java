import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World! din partea lui Sebi");

        System.out.println("This is a sad program.");

        System.out.print("Please enter a number");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("This is a sad program...");
        }

    }
}
