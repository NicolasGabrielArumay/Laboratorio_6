package Mat_NoodlesSRL;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                Cliente cliente = new Cliente();
                cliente.cargarDatos();

                Pedido pedido = new Pedido(cliente);
                pedido.cargarMedioVenta();
                
                boolean seguir = true;

                while (seguir) {

                    TipoPasta pasta = seleccionarPasta();
                    double cantidad = pedirCantidad(pasta);
                    double precio = obtenerPrecio(pasta);
                    
                    Producto producto = new Producto(pasta, cantidad, precio);

                    pedido.agregarProducto(producto);
                    System.out.print("¿Desea agregar otro producto? (S/N): ");

                    String respuesta = sc.next();

                    if (respuesta.equalsIgnoreCase("N")) {
                        seguir = false;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error inesperado.");
            }
        }
        
        //Metodos
        private static TipoPasta seleccionarPasta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Fideos al huevo");
        System.out.println("2 - Ravioles");
        System.out.println("3 - Ñoquis");
        System.out.println("4 - Agnolotis");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                return TipoPasta.FIDEOS_AL_HUEVO;
            }
            case 2 -> {
                return TipoPasta.RAVIOLES;
            }
            case 3 -> {
                return TipoPasta.ÑOQUIS;
            }
            case 4 -> {
                return TipoPasta.AGNOLOTIS;
            }
            default ->
                throw new IllegalArgumentException("Opción inválida");
        }
    }

    private static double pedirCantidad(TipoPasta pasta) {

        Scanner sc = new Scanner(System.in);

        double cantidad;

        if (pasta.esPorKg()) {

            System.out.print("Ingrese los kg: ");
            cantidad = sc.nextDouble();

            if (cantidad <= 0 || cantidad > 10) {
                throw new IllegalArgumentException(
                        "Los kg deben estar entre 0 y 10."
                );
            }

        } else {

            System.out.print("Ingrese las cajas: ");
            cantidad = sc.nextDouble();

            if (cantidad <= 0 || cantidad != (int) cantidad) {
                throw new IllegalArgumentException(
                        "La cantidad de cajas debe ser un entero positivo."
                );
            }

        }

        return cantidad;
    
    }
    
    private static double obtenerPrecio(TipoPasta pasta) {

        switch (pasta) {
            case FIDEOS_AL_HUEVO -> {
                return 2000;
            }

            case RAVIOLES -> {
                return 3500;
            }

            case ÑOQUIS -> {
                return 2500;
            }

            case AGNOLOTIS -> {
                return 4000;
            }

        default -> throw new IllegalArgumentException("Pasta inválida");
        }
    }
}

    
