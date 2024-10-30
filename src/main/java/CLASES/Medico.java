package CLASES;

import CLASES.Persona;

public class Medico extends Persona {
    private String especialidad;
    private String colegiatura;
    private String grado;
    private Horario horario;
    private Departamento departamento;
    private EquipoMedico equipoMedico;

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