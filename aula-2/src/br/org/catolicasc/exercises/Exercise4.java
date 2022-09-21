import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Type a number to calculate the factorial: ");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        int result = num;

        for(int i = num - 1; i >= 1; i--) {
            result *= i;
        }

        System.out.println("Factorial of " + num + " is equal to " + result);
    }
}
