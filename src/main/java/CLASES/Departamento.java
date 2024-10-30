package CLASES;

import java.util.List;

public class Departamento {
    private String nombre;
    private List<Medico> medicos;

    public Departamento(String nombre, List<Medico> medicos) {
        this.nombre = nombre;
        this.medicos = medicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public void obtenerMedicos() {
    }

    public void asignarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void asignarEquipo(EquipoMedico equipo) {
    }
}