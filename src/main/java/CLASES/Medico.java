package CLASES;
import java.util.Date;

public class Medico extends Persona {
    private String especialidad;
    private String colegiatura;
    private String grado;

    public Medico(String especialidad, String colegiatura, String grado, int F_dni, String F_nombres, String F_apellidos, Date F_fechaNacimiento, String F_direccion, int F_telefono, String F_email) {
        super(F_dni, F_nombres, F_apellidos, F_fechaNacimiento, F_direccion, F_telefono, F_email);
        this.especialidad = especialidad;
        this.colegiatura = colegiatura;
        this.grado = grado;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(String colegiatura) {
        this.colegiatura = colegiatura;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    public void establecerHorario(HorarioMedico horario) {
    }
}