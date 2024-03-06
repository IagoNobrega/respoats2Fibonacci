import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (isFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;

        while (c < num) {
            a = b;
            b = c;
            c = a + b;
        }

        return c == num;
    }
}
