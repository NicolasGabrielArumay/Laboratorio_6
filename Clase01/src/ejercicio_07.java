import java.util.Scanner;
public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = 25; // número a adivinar
        int intento;

        do {
            System.out.print("Ingrese un número: ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("Es mayor");
            } else if (intento > secreto) {
                System.out.println("Es menor");
            }

        } while (intento != secreto);

        System.out.println("¡Felicidades! Adivinaste el número");

        sc.close();
    } 
}
