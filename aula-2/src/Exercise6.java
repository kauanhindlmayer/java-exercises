import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int num = 1, fibonnaci = 0, aux = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the quantity of numbers desired: ");
        int quantity = reader.nextInt();

        while (quantity > 0) {
            System.out.print(fibonnaci + ", ");
            fibonnaci = num + aux;
            aux = num;
            num = fibonnaci;
            quantity--;
        }
    }
}
