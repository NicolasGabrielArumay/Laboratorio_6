import java.util.Scanner;
public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un número: ");
        n = sc.nextInt();

        System.out.println("Divisores de " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}