package ARRAYLIST;

import CLASES.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoList {
    private List<Medico> listaMedicos = new ArrayList<>();

    public void agregar(Medico medico) {
        listaMedicos.add(medico);
        System.out.println("Médico agregado");
    }

    public List<Medico> listarMedicos() {
        return listaMedicos;
    }

    public void eliminar(Medico medico) {
        listaMedicos.remove(medico);
        System.out.println("Médico eliminado: ");
    }
    public Medico buscar(int dni) {
    return listaMedicos.stream()
                .filter(paciente -> paciente.getF_dni()== dni)
                .findFirst()
                .orElse(null); 
    }
}

