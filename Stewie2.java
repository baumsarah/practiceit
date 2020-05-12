/* Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy.
//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
*/

public class Stewie2 {
    public static void main(String[] args) {
        for(int i = 0; i < 22; i++) {
            System.out.print("/");
        }
        System.out.println();
        for(int i = 0; i < 5; i++) {
            print();
        }
    }
    public static void print() {
        System.out.println("|| Victory is mine! ||");
        for(int i = 0; i < 22; i++) {
            System.out.print("\\");
        }
        System.out.println();
    }
}
