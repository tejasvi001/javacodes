package characterPatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterPatternsUsingHashMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to print its pattern: ");
        String userInput = scanner.next().trim().toUpperCase();
        for(int i=0;i<userInput.length();i++) {
        	if(Character.isLetter(userInput.charAt(0))) {
        		printPattern(userInput.charAt(i));
        		System.out.println();
        	}
        	else {
        		for(int j=1;j<=5;j++) {
        			System.out.println();
        		}
        	}
        		
        	
        	
        }
//        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
//            printPattern(userInput.charAt(0));
//        } else {
//            System.out.println("Invalid input. Please enter a single alphabetic character.");
//        }
        
        scanner.close();
    }

    private static void printPattern(char letter) {
        Map<Character, String[]> patterns = generatePatterns();

        if (patterns.containsKey(letter)) {
            for (String line : patterns.get(letter)) {
                System.out.println(line);
            }
        } else {
            System.out.println("Pattern not defined for this character.");
        }
    }

    private static Map<Character, String[]> generatePatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('A', new String[]{
                " *** ",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        });

        patterns.put('B', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        });

        patterns.put('C', new String[]{
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        });

        patterns.put('D', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                "**** "
        });

        patterns.put('E', new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*****"
        });

        patterns.put('F', new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*    "
        });

        patterns.put('G', new String[]{
                " ****",
                "*    ",
                "* ***",
                "*   *",
                " ****"
        });

        patterns.put('H', new String[]{
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        });

        patterns.put('I', new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "*****"
        });

        patterns.put('J', new String[]{
                "*****",
                "   * ",
                "   * ",
                "*  * ",
                "**** "
        });

        patterns.put('K', new String[]{
                "*   *",
                "*  * ",
                "***  ",
                "*  * ",
                "*   *"
        });

        patterns.put('L', new String[]{
                "*    ",
                "*    ",
                "*    ",
                "*    ",
                "*****"
        });

        patterns.put('M', new String[]{
                "*   *",
                "** **",
                "* * *",
                "*   *",
                "*   *"
        });

        patterns.put('N', new String[]{
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        });

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('Q', new String[]{
                " *** ",
                "*   *",
                "* * *",
                "*  **",
                " ****"
        });

        patterns.put('R', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*  * ",
                "*   *"
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        patterns.put('T', new String[]{
                "*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        });

        patterns.put('U', new String[]{
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('V', new String[]{
                "*   *",
                "*   *",
                "*   *",
                " * * ",
                "  *  "
        });

        patterns.put('W', new String[]{
                "*   *",
                "*   *",
                "* * *",
                "** **",
                "*   *"
        });

        patterns.put('X', new String[]{
                "*   *",
                " * * ",
                "  *  ",
                " * * ",
                "*   *"
        });

        patterns.put('Y', new String[]{
                "*   *",
                " * * ",
                "  *  ",
                "  *  ",
                "  *  "
        });

        patterns.put('Z', new String[]{
                "*****",
                "   * ",
                "  *  ",
                " *   ",
                "*****"
        });

        return patterns;
    }
}

