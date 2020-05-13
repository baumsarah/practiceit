/* Write a complete Java program in a class named StarFigures that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
*/

public class StarFigures {
    public static void main(String[] args) {
        coupleLines();
        domino();
        System.out.println();
        coupleLines();
        domino();
        coupleLines();
        System.out.println();
        verticalLine();
        coupleLines();
        domino();
    }
    public static void coupleLines() {
        coupleLinesHelper();
        coupleLinesHelper();
    }
    public static void coupleLinesHelper() {
        for(int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void domino() {
        dominoHelper();
        System.out.println("  *");
        dominoHelper();
    }
    public static void dominoHelper() {
        System.out.println(" * *");
    }
    public static void verticalLine() {
        for(int i = 0; i < 3; i++) {
            System.out.println("  *");
        }
    }
}
