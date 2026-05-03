import java.util.Scanner;
public class ejercicio_08 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, num;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;

        System.out.print("Ingrese cantidad de números: ");
        N = sc.nextInt();

        int[] numeros = new int[N];

        // Leer números
        for (int i = 0; i < N; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > mayor) mayor = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
        }

        // Sumar los que están entre mayor y menor
        for (int i = 0; i < N; i++) {
            if (numeros[i] > menor && numeros[i] < mayor) {
                suma += numeros[i];
            }
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
