import java.util.Scanner;
public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, suma = 0;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b = sc.nextInt();

        // Asegurar orden correcto
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
