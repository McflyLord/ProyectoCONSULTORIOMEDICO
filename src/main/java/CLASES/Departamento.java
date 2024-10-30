package CLASES;

import java.util.List;

public class Departamento {
    private String nombre;
    private List<Medico> medicos;

    public void obtenerMedicos() {
    }

    public void asignarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void asignarEquipo(EquipoMedico equipo) {
    }
}