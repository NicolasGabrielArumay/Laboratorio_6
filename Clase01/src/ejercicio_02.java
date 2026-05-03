import java.util.Scanner;
public class ejercicio_02 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese un año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " ES bisiesto");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto");
        }

        sc.close();
    }  
}
