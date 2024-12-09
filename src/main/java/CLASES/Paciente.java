package CLASES;
import java.util.Date;

public class Paciente extends Persona {
    private java.util.Date fechaInscripcion;
    private String grupoSanguineo;
    private String adversiones;  
    private String enfermedades; 
    private Observacion observacion;
    private Tratamiento tratamiento;
    private Receta receta;
    private HistorialMedico historialMedico;

    public Paciente(Date fechaInscripcion, String grupoSanguineo, String adversiones, String enfermedades, Observacion observacion, Tratamiento tratamiento, Receta receta, HistorialMedico historialMedico, int dni, String nombres, String apellidos, String direccion, String email, String telefono, String genero, Date fechaNacimiento) {
        super(dni, nombres, apellidos, direccion, email, telefono, genero, fechaNacimiento);
        this.fechaInscripcion = fechaInscripcion;
        this.grupoSanguineo = grupoSanguineo;
        this.adversiones = adversiones;
        this.enfermedades = enfermedades;
        this.observacion = observacion;
        this.tratamiento = tratamiento;
        this.receta = receta;
        this.historialMedico = historialMedico;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAdversiones() {
        return adversiones;
    }

    public void setAdversiones(String adversiones) {
        this.adversiones = adversiones;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Observacion getObservacion() {
        return observacion;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    
}
