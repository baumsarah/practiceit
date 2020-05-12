/* Write a complete Java program in a class named Egg that displays the following output:
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/

public class Egg {
    public static void main(String[] args) {
        line();
        top();
        middle();
        bottom();
    }
    public static void line() {
        System.out.print("  ");
        for(int i = 0; i < 7; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
    public static void top() {
        for(int i = 2; i > 0; i--) {
            for(int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("/"); 
            for(int j = 0; j < (i * -2 + 11); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }
    public static void middle() {
        System.out.println("-\"-\'-\"-\'-\"-");
    }
    public static void bottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
