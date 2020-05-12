/* Write a complete Java program in a class named Stewie that prints the following output:
//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
*/

public class Stewie {
    public static void main(String[] args) {
        print("/");
        System.out.println("|| Victory is mine! ||");
        print("\\");
    }
    public static void print(String toPrint) {
        for(int i = 0; i < 22; i++) {
            System.out.print(toPrint);
        }
        System.out.println();
    }
}
