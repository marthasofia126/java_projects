import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello, world!");
        Scanner in = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = in.NextLine();

        System.out.println("Hello, " + name);
    }
}
