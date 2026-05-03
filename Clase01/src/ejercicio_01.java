
import java.util.Scanner;

public class ejercicio_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        // Cargar el array
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Suma
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += numeros[i];
        }

        // Promedio
        double promedio = suma / 3.0;

        // Mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 3; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Cantidad de diferentes
        int diferentes;
        if (numeros[0] == numeros[1] && numeros[1] == numeros[2]) {
            diferentes = 1;
        } else if (numeros[0] != numeros[1] && numeros[0] != numeros[2] && numeros[1] != numeros[2]) {
            diferentes = 3;
        } else {
            diferentes = 2;
        }

        // Producto mayor * menor
        int producto = mayor * menor;

        // Número restante (el del medio)
        int restante = 0;
        boolean hayRestanteUnico = (diferentes == 3);

        if (hayRestanteUnico) {
            for (int i = 0; i < 3; i++) {
                if (numeros[i] != mayor && numeros[i] != menor) {
                    restante = numeros[i];
                }
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de números diferentes: " + diferentes);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto del mayor por el menor: " + producto);

        if (hayRestanteUnico) {
            System.out.println("Número restante: " + restante);

            if (restante % 3 == 0) {
                System.out.println("Es divisible por 3");
            } else {
                System.out.println("No es divisible por 3");
            }
        } else {
            System.out.println("No hay un número restante único.");
        }

        sc.close();
    }
}