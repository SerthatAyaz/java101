import java.util.Scanner;

public class RecursiveModel {
    public static void main(String[] args) {
        RecursiveTestApp.run();
    }
}

class RecursiveTestApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter a number :");
        Recursive.design(kb.nextInt());
    }

}

class Recursive {
    public static int add(int i, int b) {
        int n = 5;
        System.out.printf(" %d", i);
        return (i < b) ? add(i + n, b) : i;
    }
    public static int sub(int i) {
        int n = 5;
        System.out.printf(" %d", i);
        return (i > 0) ? sub(i-n) : i + n;
    }
    public static void design(int n) {
        add(sub(n), n);
    }
}