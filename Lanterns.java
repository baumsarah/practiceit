/* Write a complete Java program in a class named Lanterns that generates the following three figures of output. 
Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements except for blank lines, that any 
System.out.println statement(s) repeated are captured in a method that is called just once, and that the same 
System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
*/

public class Lanterns {
    public static void main(String[] args) {
        top();
        System.out.println();
        top();
        specialLine();
        bigLine();
        top();
        System.out.println();
        top();
        smallLine();
        specialLine();
        specialLine();
        smallLine();
        smallLine();
    }
    public static void top() {
        for(int i = 1; i < 4; i++) { //i = 1, space = 4; i = 2, space = 2; i = 3, space = 0
            for(int j = 0; j < (i * -2 + 6); j++) {
                System.out.print(" ");
            } //i = 1, star = 5; i = 2, star = 9; i = 3, star = 13
            for(int j = 0; j < (i * 4 + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void bigLine() {
        for(int i = 0; i < 13; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void smallLine() {
        for(int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        for(int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void specialLine() {
        System.out.println("* | | | | | *");
    }
}
