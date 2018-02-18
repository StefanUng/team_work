import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyVector {

    public static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many notes to you have?");
        System.out.print("Notes: ");
        int notes = scanner.nextInt();

        ArrayList<Integer> notesList = new ArrayList<>(notes);
        ArrayList<Integer> notesRepetitionList = new ArrayList<>(10);

        for (int i = 0; i < 10; ++i) {
            notesRepetitionList.add(i, 0);
        }

        for (int i = 0; i < notes; ++i) {
            System.out.print("Note " + (i + 1) + ": ");
            int note = scanner.nextInt();
            notesList.add(note);
        }

        System.out.println();
        for (int i : notesList) {
            if (i == notesList.get(notes - 1)) {
                System.out.print(i + "\n\n");
                break;
            }
            System.out.print(i + ", ");
        }

        for (int i = 0; i < notesList.size(); ++i) {
            int n = notesList.get(i);
            notesRepetitionList.set(n - 1, notesRepetitionList.get(n - 1) + 1);
        }

        for (int i = 1; i <= 10; ++i) {
            System.out.print(i + "  ");
        }
        System.out.print("\n");

        for (int i = 0; i < 10; ++i) {
            if (i == 9) {
                System.out.print(notesRepetitionList.get(i) + "\n\n");
                break;
            }
            System.out.print(notesRepetitionList.get(i) + ", ");
        }

        for (int i = 0; i < 10; i++) {
            if (notesRepetitionList.get(i) != 0) {
                if (notesRepetitionList.get(i) == 1){
                    System.out.println("You have " + notesRepetitionList.get(i) + " number " + (i+1));
                } else {
                    System.out.println("You have " + notesRepetitionList.get(i) + " number " + (i+1) + "'s");
                }
            }

        }
    }
}
