package Validadores;
import java.util.regex.Pattern;

public class Validador {
    
    public boolean validarDNI(String DNI) {
        return DNI.matches("\\d{8}");
    }

    public  boolean validarSoloLetras(String texto) {
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");
    }

    // Validación para Fecha de Nacimiento (mayor de edad)
    public  boolean esMayorDeEdad(java.util.Date fechaNacimiento) {
        java.util.Calendar fechaActual = java.util.Calendar.getInstance();
        java.util.Calendar fechaNac = java.util.Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        int edad = fechaActual.get(java.util.Calendar.YEAR) - fechaNac.get(java.util.Calendar.YEAR);
        if (fechaActual.get(java.util.Calendar.MONTH) < fechaNac.get(java.util.Calendar.MONTH) ||
            (fechaActual.get(java.util.Calendar.MONTH) == fechaNac.get(java.util.Calendar.MONTH) &&
             fechaActual.get(java.util.Calendar.DAY_OF_MONTH) < fechaNac.get(java.util.Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad >= 18;
    }

    public  boolean validarTelefono(String telefono) {
        return telefono.matches("\\d{9}");
    }

    // Validación para Email
    public  boolean validarEmail(String email) {
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(regexEmail, email);
    }

    // Validación para Dirección (letras, números y caracteres especiales comunes)
    public  boolean validarDireccion(String direccion) {
        return direccion.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s,\\.\\-#]+") && direccion.length() <= 150;
    }

    // Validación para verificar que una opción esté seleccionada (ComboBox o RadioButton)
    public  boolean validarSeleccion(Object seleccion) {
        return seleccion != null;
    }
}
