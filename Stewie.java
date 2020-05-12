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
