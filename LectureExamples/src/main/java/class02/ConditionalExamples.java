package class02;

import java.util.HashMap;
import java.util.Scanner;

public class ConditionalExamples {

    public static void main(String[] args) {

        /* EQUALITY & LOGICAL OPERATORS */

        // TODO: Print several boolean expressions using different operators with the specified types

        // 6 is not equal to 3 + 4
        System.out.println(6 != 3 + 4);

        // 8.146 is greater than or equal to 10
        System.out.println(8.146 >= 10);

        // "LaunchCode" is equal to "launchcode" if case-insensitive
        System.out.println("LaunchCode" == "launchcde");

        // 15 is greater than 10 AND is less than or equal to 20
        System.out.println(15 > 10 && 15 <= 20);

        // "fellowship" contains the substring "boat" OR "ship"
        System.out.println("fellowship".contains("boat") || "fellowship".contains("ship"));

        /* IF, ELSE-IF, AND ELSE */

        // TODO: Open a scanner for user input
        Scanner input = new Scanner(System.in);

        // TODO: Store information about a noble in a map

        // Create a HashMap with String key and String value
        HashMap <String, String> noble = new HashMap<>();

        // Prompt the user for a name
        System.out.print("Enter a name: ");
        String name = input.nextLine();

        // Store the name in the map
        noble.put("name", name);
        // Declare (but do not initialize) a String, title
        String title;


        // Construct a series of if/else-if/else blocks to initialize the title
        //   Eomer becomes King of Rohan
        //   Eowyn becomes Lady of Ithilien
        //   Aragorn becomes King of Gondor
        if (name.equals("Eomer")) {
            title = "King of Rohan";
        } else if (name.equals("Eowyn")) {
            title = "Lady of Ithilien";
        } else if (name.equals("Aragorn")){
            title = "King of Gondor";
        } else {
            System.out.println("No title available");
            title = null;
        }

        // Set the title into the map
        noble.put("title", title);

        // Print the map
        System.out.println(noble);

        // Print a sentence using the noble's name and title

        System.out.println("Welcome to the city " + noble.get("name") + ", " + noble.get("title"));

        // Don't close scanner yet


        /* SWITCH STATEMENTS */

        // TODO: Store information about a noble in a map

        // Create a HashMap with String key and String value
        HashMap<String, String> info = new HashMap<>();

        // Prompt the user for a name
        System.out.print("Please enter a name: ");
        String elfName = input.nextLine();
        // Store the name in the map
        info.put("name", elfName);
        // Declare (but do not initialize) a String, realm
        String realm;
        // Construct a switch statement to initialize the realm
        //   Legolas is from the Woodland Realm
        //   Elrond is from Rivendell
        //   Galadriel is from Lothlórien

        switch (elfName) {
            case "Legolas":
                realm = "the Woodland Realm";
                break;
            case "Elrond":
                realm = "Rivendell";
                break;
            case "Galadriel":
                realm = "Lothlórien";
                break;
            default:
                realm = "Unknown";
        }
//        switch (elfName) {
//            case "Legolas" -> realm = "the Woodland Realm";
//        }

        // Set the realm into the map
        info.put("realm", realm);
        // Print the map
        System.out.println(info);
        // Print a sentence using the elf's name and realm
        System.out.println("This is " + info.get("name") + ", from" + info.get("realm"));
        // TODO: Close the scanner
        input.close();
    }

}
