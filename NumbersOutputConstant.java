/* Modify your code from the previous exercise so that it could easily be modified to display a different 
range of numbers (instead of 1234567890) and a different number of repetitions of those numbers 
(instead of 60 total characters), with the vertical bars still matching up correctly. 
Write a complete class named NumbersOutput. Use two class constants instead of "magic numbers,", 
with one constant set to 6 for the number of repetitions, and the other set to 10 for the range of numbers. 
Put the for loop code in your class's main method.

For example, if your number-of-repetitions constant is set to 7 and your range constant is set to 5, the 
output should be the following:

    |    |    |    |    |    |    |
12340123401234012340123401234012340
(You must solve this problem using only exactly two public static final constants, no more, no less.)
*/

public class NumbersOutput {
    public static final int NUM1 = 6;
    public static final int NUM2 = 10;
    public static void main(String[] args) {
        for(int i = 0; i < NUM1; i++) {
            for(int j = 1; j < NUM2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i = 0; i < NUM1; i++) {
            for(int j = 1; j < NUM2 + 1; j++) {
                System.out.print(j % NUM2);
            }
        }
    }
}
