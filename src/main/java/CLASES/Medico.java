package CLASES;

public class Medico extends Persona {
    private String especialidad;
    private String colegiatura;
    private String grado;
    private Horario horario;
    private Departamento departamento;
    private EquipoMedico equipoMedico;

    public Medico(String especialidad, String colegiatura, String grado, Horario horario, Departamento departamento, EquipoMedico equipoMedico, int dni, String nombre, String apellido, int fechanacimiento, String direccion, String telefono, String email, String genero) {
        super(dni, nombre, apellido, fechanacimiento, direccion, telefono, email, genero);
        this.especialidad = especialidad;
        this.colegiatura = colegiatura;
        this.grado = grado;
        this.horario = horario;
        this.departamento = departamento;
        this.equipoMedico = equipoMedico;
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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public EquipoMedico getEquipoMedico() {
        return equipoMedico;
    }

    public void setEquipoMedico(EquipoMedico equipoMedico) {
        this.equipoMedico = equipoMedico;
    }

    public void registrar() {
    }

    public void modificar() {
    }

    public void establecerHorario() {
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void asignarEquipoMedico(EquipoMedico equipoMedico) {
        this.equipoMedico = equipoMedico;
    }
}