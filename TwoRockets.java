/* Write a complete Java program in a class named TwoRockets that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.
Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? 
What redundancy cannot be eliminated?
   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \
*/

public class TwoRockets {
    public static void main(String[] args) {
        arrow();
        square();
        unitedStates();
        square();
        arrow();
    }
    public static void arrow() {
        for(int i = 1; i < 4; i++) { //i = 1, space = 3; i = 2, space = 2; i = 3, space = 1
            for(int j = 0; j < (i * -1 + 4); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 0; j < ((i - 1) * 2); j++) {
                System.out.print(" ");
            }
            System.out.print("\\"); //i = 1, space = 7; i = 2, space = 5; i = 3, space = 3
            for(int j = 0; j < (i * -2 + 9); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 0; j < ((i - 1) * 2); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }
    public static void square() {
        squareHelper1();
        squareHelper1();
        System.out.println();
        squareHelper2();
        squareHelper2();
        System.out.println();
        squareHelper2();
        squareHelper2();
        System.out.println();
        squareHelper1();
        squareHelper1();
        System.out.println();
    }
    public static void squareHelper1() {
        System.out.print("+");
        for(int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+ ");
    }
    public static void squareHelper2() {
        System.out.print("|");
        for(int i = 0; i < 6; i++) {
            System.out.print(" ");
        }
        System.out.print("| ");
    }
    public static void unitedStates() {
        unitedStatesHelper1();
        unitedStatesHelper1();
        System.out.println();
        unitedStatesHelper2();
        unitedStatesHelper2();
        System.out.println();
    }
    public static void unitedStatesHelper1() {
        System.out.print("|United| ");
    }
    public static void unitedStatesHelper2() {
        System.out.print("|States| ");
    }
}
