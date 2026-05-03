import java.util.Scanner;
public class ejercicio_03 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        long factorial = 1;

        System.out.print("Ingrese un número: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial es: " + factorial);

        sc.close();
    }   
}
