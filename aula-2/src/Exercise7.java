import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number to start: ");
        int number = reader.nextInt();

        while(number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = 3 * number + 1;
            }
            System.out.println(number);
        }
    };
}
