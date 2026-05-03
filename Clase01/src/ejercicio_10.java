import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            double horas, tarifa, sueldo;

            System.out.print("Empleado " + i + " - Horas trabajadas: ");
            horas = sc.nextDouble();

            System.out.print("Empleado " + i + " - Tarifa por hora: ");
            tarifa = sc.nextDouble();

            if (horas <= 40) {
                sueldo = horas * tarifa;
            } else {
                sueldo = 40 * tarifa + (horas - 40) * tarifa * 1.5;
            }

            System.out.println("Sueldo bruto: " + sueldo);
        }

        sc.close();
    }
}