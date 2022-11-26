package Task1;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        if (a == b) {
            System.out.println("Impossible");
            return;
        }
        System.out.println((h - 2 * b + a - 1) / (a - b) + " days");
    }
}
