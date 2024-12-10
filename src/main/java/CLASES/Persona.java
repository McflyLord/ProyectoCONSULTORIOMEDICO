package CLASES;
import java.util.Date;

public class Persona {
    int F_dni;
    private String F_nombres;
    private String F_apellidos;
    private Date F_fechaNacimiento;
    private String F_direccion;
    private int F_telefono;
    private String F_email;

    public Persona(int F_dni, String F_nombres, String F_apellidos, Date F_fechaNacimiento, String F_direccion, int F_telefono, String F_email) {
        this.F_dni = F_dni;
        this.F_nombres = F_nombres;
        this.F_apellidos = F_apellidos;
        this.F_fechaNacimiento = F_fechaNacimiento;
        this.F_direccion = F_direccion;
        this.F_telefono = F_telefono;
        this.F_email = F_email;
    }

    public int getF_dni() {
        return F_dni;
    }

    public void setF_dni(int F_dni) {
        this.F_dni = F_dni;
    }

    public String getF_nombres() {
        return F_nombres;
    }

    public void setF_nombres(String F_nombres) {
        this.F_nombres = F_nombres;
    }

    public String getF_apellidos() {
        return F_apellidos;
    }

    public void setF_apellidos(String F_apellidos) {
        this.F_apellidos = F_apellidos;
    }

    public Date getF_fechaNacimiento() {
        return F_fechaNacimiento;
    }

    public void setF_fechaNacimiento(Date F_fechaNacimiento) {
        this.F_fechaNacimiento = F_fechaNacimiento;
    }

    public String getF_direccion() {
        return F_direccion;
    }

    public void setF_direccion(String F_direccion) {
        this.F_direccion = F_direccion;
    }

    public int getF_telefono() {
        return F_telefono;
    }

    public void setF_telefono(int F_telefono) {
        this.F_telefono = F_telefono;
    }

    public String getF_email() {
        return F_email;
    }

    public void setF_email(String F_email) {
        this.F_email = F_email;
    }

    public void registrar() {
    }

    public void modificar() {
    }

    public void eliminar() {
    }

    public void buscar() {
    }
}
