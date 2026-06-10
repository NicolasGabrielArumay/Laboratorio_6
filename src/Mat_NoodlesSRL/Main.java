
package Mat_NoodlesSRL;

public class Main {
    public static void main(String[] args) {
        try{
        
        Cliente cliente = new Cliente();
        cliente.cargarDatos();
        
        Pedido pedido = new Pedido(cliente);
        
        
        }catch(Exception e){
            System.out.println("Error inesperado.");
        }
    }
}
