// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {

    public static void oddOrEven(int k) {

        if (k % 2 == 0) {
            System.out.println(k + " is even.");
        }

        else {
            System.out.println(k + " is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter integer: ");

        while (true) {
            int num = myScanner.nextInt();
            if (num == -1) {
                break;
            }
            else {
                oddOrEven(num);
            }
        }
    }
}