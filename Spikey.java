/* Write a complete Java program in a class named Spikey that prints the following output: 
  \/
 \\//
\\\///
///\\\
 //\\
  /\
*/

public class Spikey {
    public static void main(String[] args) {
        top();
        bottom();
    }
    public static void top() {
        for(int i = 0; i < 3; i++) {
            for(int j = 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("\\");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
    public static void bottom() {
        for(int i = 3; i > 0; i--) {
            for(int j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("/");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
