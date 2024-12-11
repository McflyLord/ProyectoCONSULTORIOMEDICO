package Validadores;
//  Devuelve un valor boolean (.matches), además sirve para ver si la cadema cumple con la condiciòn establecidad. 

public class Validador {
    
    // Validamos DNI que tenga 8 números
    public static boolean DNI(String dni) {
        return dni.matches("\\d{8}");
    }

    // Validamos Nombres y Apellidos con letras y espacios
    public static boolean Letras(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\\\s'-]+");
    }

    // Validamos dirección
    public static boolean Direccion(String direccion) {
        return direccion.matches("[a-zA-Z\\\\d\\\\s#.,-°/áéíóúÁÉÍÓÚñÑ]+");
    }

    // Validamos Email
    public static boolean Email(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

    // Validamos teléfono que tenga 9 números
    public static boolean Telefono(String telefono) {
        return telefono.matches("\\d{9}");
    }
    
    // Colegiatura
    public static boolean Colegiatura(String colegiatura) {
        return colegiatura.matches("\\d{5}");
    }
}