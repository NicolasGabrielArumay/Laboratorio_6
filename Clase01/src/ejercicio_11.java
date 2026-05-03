import java.util.Scanner;
public class ejercicio_11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binario;
        int decimal = 0;
        int base = 1; // 2^0

        System.out.print("Ingrese un número binario: ");
        binario = sc.nextInt();

        while (binario > 0) {
            int ultimoDigito = binario % 10;
            decimal += ultimoDigito * base;
            base *= 2;
            binario /= 10;
        }

        System.out.println("En decimal es: " + decimal);

        sc.close();
    }
}
