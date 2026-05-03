import java.util.Scanner;
public class ejercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;

        System.out.print("Ingrese el radio: ");
        r = sc.nextInt();

        double diametro = 2 * r;
        double circunferencia = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Diámetro: " + diametro);
        System.out.println("Circunferencia: " + circunferencia);
        System.out.println("Área: " + area);

        sc.close();
    }
}
