import java.util.Scanner;

public class RegistroFormulario {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bienvenido al formulario de registro");
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su apellido: ");
            String apellido = scanner.nextLine();
            
            System.out.print("Ingrese su correo electrónico: ");
            String correo = scanner.nextLine();
            
            System.out.println("\nRegistro completado con éxito.");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Correo electrónico: " + correo);
        }
    }
}
