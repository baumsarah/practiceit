/* Write a complete Java program in a class named EggStop that generates the following output. 
Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+
*/

public class EggStop {
    public static void main(String[] args) {
        top();
        bottom();
        System.out.println();
        top();
        bottom();
        line();
        System.out.println();
        top();
        stop();
        bottom();
        line();
    }
    public static void top() {
        System.out.println("  ______");
        for(int i = 1; i < 3; i++) {
            for(int j = 0; j < (i * -1 + 2); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j = 0; j < (i * 2 + 4); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }
    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    public static void stop() {
        System.out.println("|  STOP  |");
    }
    public static void line() {
        System.out.print("+");
        for(int i = 0; i < 8; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
