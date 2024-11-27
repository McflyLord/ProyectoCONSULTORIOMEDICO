package ARRAYLIST;
import CLASES.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteList {
    List<Paciente> listaPacientes = new ArrayList<>();

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
        System.out.println("Paciente agregado:" + p.getNombre());
    }

    public void eliminarPaciente(Paciente p) {
        if (listaPacientes.remove(p)) {
            System.out.println("Paciente eliminado: " + p.getNombre());
        } else {
            System.out.println("No se encontro");
        }
    }

    public Paciente buscarPaciente(int dni) {
       for (Paciente paciente : listaPacientes) {
        if (paciente.getDni() == dni) {
            System.out.println("Paciente encontrado: " + paciente.getNombre());
            return paciente;
        }
    }
    System.out.println("Paciente " + dni + " no encontrado");
    return null;
}

    public void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : listaPacientes) {
                System.out.println(paciente.getNombre());
            }
        }
    }
}