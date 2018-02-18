import java.util.Scanner;
import java.util.regex.Pattern;

public class ProjectStartingProgram {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");

        System.out.println("Can we print a tree?");
        System.out.println("Yes we can");

        System.out.print("Please enter a number");
        int num = scanner.nextInt();

        for (int i = 1; i < num + 1; i++) {
            if (i < num + 1) {
                for (int j = 1; j < i + 1; ++j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        //num = 3      i = 3
        for (int i = num + 1; i > 0; --i) {
            for (int j = 1; j > num + 1; --j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        String a = "sdsdsd";


        System.out.println(Pattern.matches("<s*d>", a));
    }
}
