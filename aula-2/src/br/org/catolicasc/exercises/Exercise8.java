import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number to start: ");
        int num = reader.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1, k = 2; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
