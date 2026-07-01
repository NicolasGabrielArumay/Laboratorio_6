
package Mat_NoodlesSLR;

import java.util.Scanner;

public class Cliente{

    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String mail, String telefono, String direccion) {
        setNombre(nombre);
        setApellido(apellido);
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }

        if (nombre.matches(".*\\d.*")) {
            throw new IllegalArgumentException("El nombre no puede contener numeros.");
        }

        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
        }

        if (apellido.matches(".*\\d.*")) {
            throw new IllegalArgumentException("El apellido no puede contener numeros.");
        }

        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                nombre + " " 
                + apellido;
    }
    public void pedirDatos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        if (nombre.isEmpty() || nombre.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Nombre invalido");
        }
        setNombre(nombre);

        System.out.println("Apellido:");
        String apellido = sc.nextLine();

        if (apellido.isEmpty() || apellido.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Apellido invalido");
        }
        setApellido(apellido);

        System.out.println("Mail:");
        setMail(sc.nextLine());

        System.out.println("Telefono:");
        setTelefono(sc.nextLine());

        System.out.println("Direccion:");
        setDireccion(sc.nextLine());
    }
}