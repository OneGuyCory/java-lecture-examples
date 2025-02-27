package class02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopExamples {

    public static void main(String[] args) {

        /* FOR LOOP */

        String[] battles = {
                "The Battle of Moria",
                "The Battle for Isengard",
                "The Battle of Helm's Deep",
                "The Battle of the Pelennor Fields",
                "The Battle of the Black Gate"
        };

        // TODO: Construct a basic for loop to print each battle
        for (int i = 0; i < 5; i++) {
            System.out.println(battles[i]);
        }


        /* FOR-EACH LOOP */

        String[] words = {"YOU", "SHALL", "NOT", "PASS"};

        // TODO: Construct a for-each loop to print each element of the Array above
        for (String word : words) {
            System.out.println(word);
        }

        /* FOR EACH LOOP WITH MAP */

        HashMap<String, String> moria = new HashMap<>();

        moria.put("name", "the Mines of Moria");
        moria.put("ancientName", "Khazad-dûm");
        moria.put("location", "the Misty Mountains");
        moria.put("founder", "Durin");
        moria.put("king", "Balin");
        moria.put("monster", "a balrog");

        // TODO: Construct three for-each loops for the HashMap above

        // Loop through keys and print each
        for (String key : moria.keySet()) {
            System.out.println(key);
        }
        // Loop through values and print each
        for (String val : moria.values()) {
            System.out.println(val);
        }
        // Loop through entries (key/value pairs) and print them
        for (Map.Entry<String, String> kvp : moria.entrySet()) {
            System.out.println(kvp.getKey() + " : " + kvp.getValue());
        }

        /* WHILE LOOP */

        int[] orcs = {2, 14, 33, 57, 61, 89, 94, 106, 123, 176};

        // TODO: Construct a while loop to print each number in the Array above as long as the value is below 100
        int index = 0;
        while (orcs[index] < 100) {
            System.out.println(orcs[index]);
            index++;
        }
        /* DO-WHILE LOOP */

        ArrayList<String> bookTitles = new ArrayList<>();

        // TODO: Construct a do-while loop to ask the user for book titles until they enter "QUIT"
        // HINT: use .nextLine() instead of .next() to handle multi-word strings
        // Unless quitting, add each title to the collection above
        // Print the collection after the loop closes
        String bookTitle;
        Boolean isQuitting = false;

        do {
            System.out.println("Enter a book title, or QUIT to end: ");
            Scanner input = new Scanner(System.in);
            bookTitle = input.nextLine();
            isQuitting = bookTitle.toLowerCase().equals("quit");
            if (!isQuitting) {
                bookTitles.add(bookTitle);
            }
        } while (!isQuitting);
        System.out.println(bookTitles);
    }

}
