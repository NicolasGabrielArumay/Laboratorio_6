import java.util.Scanner;

public class ejercicio_05 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un número: ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    } 
}
