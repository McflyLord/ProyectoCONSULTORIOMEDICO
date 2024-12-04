package Validadores;
import java.util.regex.Pattern;

// Usamos BOOLEAN por que al ser un validador es una condicion y este tipo de dato devuelve True y False.
//  Devuelve un valor boolean (.matches), además sirve para ver si la cadema cumple con la condiciòn establecidad. 

public class Validador {
    
    // Validamos DNI que tenga 8 números
    public static boolean DNI(String dni) {
        return dni.matches("\\d{8}");
    }

    // Validamos Nombres y Apellidos con letras y espacios
    public static boolean Letras(String texto) {
        return texto.matches("[a-zA-Z\\s]+");
    }

    // Validamos dirección
    public static boolean Direccion(String direccion) {
        return direccion.matches("[a-zA-Z\\d\\s#.,-]+");
    }

    // Validamos Email
    public static boolean Email(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    // Validamos teléfono que tenga 9 números
    public static boolean Telefono(String telefono) {
        return telefono.matches("\\d{9}");
    }
}