package characterPatterns;

import java.util.Scanner;

public class CharacterPatternsUsingMultipleFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character to print its pattern: ");
        String userInput = scanner.next().trim().toUpperCase();

        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            printPattern(userInput.charAt(0));
        } else {
            System.out.println("Invalid input. Please enter a single alphabetic character.");
        }

        scanner.close();
    }

    private static void printPattern(char letter) {
        switch (letter) {
            case 'A': printA(); break;
            case 'B': printB(); break;
            case 'C': printC(); break;
            case 'D': printD(); break;
            case 'E': printE(); break;
            case 'F': printF(); break;
            case 'G': printG(); break;
            case 'H': printH(); break;
            case 'I': printI(); break;
            case 'J': printJ(); break;
            case 'K': printK(); break;
            case 'L': printL(); break;
            case 'M': printM(); break;
            case 'N': printN(); break;
            case 'O': printO(); break;
            case 'P': printP(); break;
            case 'Q': printQ(); break;
            case 'R': printR(); break;
            case 'S': printS(); break;
            case 'T': printT(); break;
            case 'U': printU(); break;
            case 'V': printV(); break;
            case 'W': printW(); break;
            case 'X': printX(); break;
            case 'Y': printY(); break;
            case 'Z': printZ(); break;
            default: System.out.println("Pattern not defined for this character.");
        }
    }

    private static void printA() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 4) {
                    if (!(i == 0 && (j == 0 || j == 4))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printB() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || j == 0 || j == 4) {
                    if (!(i == 0 && j == 4) && !(i == 2 && j == 4) && !(i == 4 && j == 4)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printC() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0) {
                    if (!(i == 0 && j == 0) && !(i == 4 && j == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Define other character patterns similarly...
    // For brevity, I'm only showing patterns for A, B, and C

    private static void printD() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    if (!(i == 0 && j == 4) && !(i == 4 && j == 4)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printE() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printF() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printG() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || (i == 2 && j > 1) || (j == 4 && i > 1)) {
                    if (!(i == 0 && j == 0) && !(i == 4 && j == 0) && !(j == 4 && i == 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printH() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printI() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printJ() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || (j == 2 && i < 4) || (i == 4 && j < 3) || (j == 0 && i == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Define other character patterns similarly...

    private static void printK() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == j && i > 1) || (i + j == 4 && i < 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printL() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printM() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || (i == j && i < 3) || (i + j == 4 && i < 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printN() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printO() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 4) && (j > 0 && j < 4) || (j == 0 || j == 4) && (i > 0 && i < 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printP() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || j == 0 || (j == 4 && i < 2)) {
                    if (!(i == 0 && j == 4)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printQ() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == 4) && (j > 0 && j < 4) || (j == 0 || j == 4) && (i > 0 && i < 4) || (i == j && i > 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printR() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || j == 0 || (j == 4 && i < 2) || (i == j && i > 1)) {
                    if (!(i == 0 && j == 4) && !(i == 2 && j == 4)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printS() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || (j == 0 && i < 2) || (j == 4 && i > 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printT() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printU() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j == 0 || j == 4) && i < 4 || (i == 4 && j > 0 && j < 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printV() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((j == 0 || j == 4) && i < 3 || (i == 3 && (j == 1 || j == 3)) || (i == 4 && j == 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printW() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || (i == 3 && (j == 1 || j == 3)) || (i == 2 && (j == 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printX() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printY() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == j && i < 3) || (i + j == 4 && i < 3) || (j == 2 && i >= 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printZ() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || i + j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

