package CLASES;
import java.util.Date;

public class Medico extends Persona {
    private String F_especialidad;
    private String F_colegiatura;
    private String F_grado;

    public Medico(String F_especialidad, String F_colegiatura, String F_grado, int F_dni, String F_nombres, String F_apellidos, Date F_fechaNacimiento, String F_genero, String F_direccion, int F_telefono, String F_email) {
        super(F_dni, F_nombres, F_apellidos, F_fechaNacimiento, F_genero, F_direccion, F_telefono, F_email);
        this.F_especialidad = F_especialidad;
        this.F_colegiatura = F_colegiatura;
        this.F_grado = F_grado;
    }

    public String getF_especialidad() {
        return F_especialidad;
    }

    public void setF_especialidad(String F_especialidad) {
        this.F_especialidad = F_especialidad;
    }

    public String getF_colegiatura() {
        return F_colegiatura;
    }

    public void setF_colegiatura(String F_colegiatura) {
        this.F_colegiatura = F_colegiatura;
    }

    public String getF_grado() {
        return F_grado;
    }

    public void setF_grado(String F_grado) {
        this.F_grado = F_grado;
    }

    public void establecerHorario(HorarioMedico horario) {
    }
}