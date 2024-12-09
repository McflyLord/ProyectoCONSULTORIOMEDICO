package CLASES;

import java.util.Date;

public class Medico extends Persona {
    private String especialidad;
    private String colegiatura;
    private String grado;
    private Horario horario;
    private Departamento departamento;
    private EquipoMedico equipoMedico;

    public Medico(String especialidad, String colegiatura, String grado, Horario horario, Departamento departamento, EquipoMedico equipoMedico, int dni, String nombres, String apellidos, String direccion, String email, String telefono, String genero, Date fechaNacimiento) {
        super(dni, nombres, apellidos, direccion, email, telefono, genero, fechaNacimiento);
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

    
}