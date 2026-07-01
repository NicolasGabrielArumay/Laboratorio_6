package Mat_NoodlesSLR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            char otroCliente = 'S';

            while (otroCliente != 'N') {

            Cliente cliente = new Cliente();
            cliente.pedirDatos();

            Pedido pedido = new Pedido(); 
            pedido.setCliente(cliente);
            pedido.pedirMedioVenta();

            char seguir = 'S';

            while (seguir != 'N') {

                Producto producto = new Producto();
                producto.cargarProducto();

                pedido.agregarProducto(producto);

                System.out.println("Desea agregar otro producto? (S/N)");
                seguir = sc.next().toUpperCase().charAt(0);
            }

            pedido.mostrarResumen();

            System.out.println("Ingresar otro cliente? (S/N)");
            otroCliente = sc.next().toUpperCase().charAt(0);
            }
        }

        catch (InputMismatchException e) {
            System.out.println("Tipo de dato incorrecto");
        }
        catch (PedidoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }
}



    
