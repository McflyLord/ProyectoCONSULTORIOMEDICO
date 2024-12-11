package CLASES;
import java.util.Date;

public class Paciente extends Persona {
    private String F_grupoSanguineo;
    private String F_aversiones;
    private String F_enfermedades;
    private Date F_fechaInscripcion;

    Paciente(String F_grupoSanguineo, String F_aversiones, String F_enfermedades, Date F_fechaInscripcion, int F_dni, String F_nombres, String F_apellidos, Date F_fechaNacimiento, String F_genero, int F_telefono, String F_direccion, String F_email) {
        super(F_dni, F_nombres, F_apellidos, F_fechaNacimiento, F_genero, F_direccion, F_telefono, F_email);
        this.F_grupoSanguineo = F_grupoSanguineo;
        this.F_aversiones = F_aversiones;
        this.F_enfermedades = F_enfermedades;
        this.F_fechaInscripcion = F_fechaInscripcion;
    }


    public String getF_grupoSanguineo() {
        return F_grupoSanguineo;
    }

    public void setF_grupoSanguineo(String F_grupoSanguineo) {
        this.F_grupoSanguineo = F_grupoSanguineo;
    }

    public String getF_aversiones() {
        return F_aversiones;
    }

    public void setF_aversiones(String F_aversiones) {
        this.F_aversiones = F_aversiones;
    }

    public String getF_enfermedades() {
        return F_enfermedades;
    }

    public void setF_enfermedades(String F_enfermedades) {
        this.F_enfermedades = F_enfermedades;
    }

    public Date getF_fechaInscripcion() {
        return F_fechaInscripcion;
    }

    public void setF_fechaInscripcion(Date F_fechaInscripcion) {
        this.F_fechaInscripcion = F_fechaInscripcion;
    }

    
    public void mostrarHistorial() {
    }
 }   

