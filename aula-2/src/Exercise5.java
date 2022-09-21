import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the quantity of numbers which will be printed: ");
        int quantity = reader.nextInt();

        for(int i = 1; i <= quantity; i++) {
            System.out.println("Type the number " + i + " to calculate the factorial: ");
            int num = reader.nextInt();

            long result = num;

            for(int j = num - 1; j >= 1; j--) {
                result *= j;
            }

            System.out.println("Factorial of " + num + " is equal to " + result);
        }
    }
}
