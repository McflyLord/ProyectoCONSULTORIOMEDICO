package CLASES;

public class Paciente extends Persona {
    private String grupoSanguineo;
    private String aversion;
    private String enfermedades;
    private Observacion observacion;
    private Tratamiento tratamiento;
    private Receta receta;
    private HistorialMedico historialMedico;

    public Paciente(String grupoSanguineo, String aversion, String enfermedades, Observacion observacion, Tratamiento tratamiento, Receta receta, HistorialMedico historialMedico, int dni, String nombre, String apellido, int fechanacimiento, String direccion, String telefono, String email, String genero) {
        super(dni, nombre, apellido, fechanacimiento, direccion, telefono, email, genero);
        this.grupoSanguineo = grupoSanguineo;
        this.aversion = aversion;
        this.enfermedades = enfermedades;
        this.observacion = observacion;
        this.tratamiento = tratamiento;
        this.receta = receta;
        this.historialMedico = historialMedico;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAversion() {
        return aversion;
    }

    public void setAversion(String aversion) {
        this.aversion = aversion;
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

    public void registrar() {
    }

    public void obtener() {
    }

    public void agendarCita() {
    }

    public void consultarCita() {
    }
}