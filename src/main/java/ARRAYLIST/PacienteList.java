package ARRAYLIST;
import CLASES.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteList {
    List<Paciente> listaPacientes = new ArrayList<>();    //Instanciamos una variable de tipo list y lo llamamos ListaPacientes.

    public void agregar(Paciente p) {       // Utilizamos add lo que nos permite agregar pacientes a la lista.
        listaPacientes.add(p);
        System.out.println("Paciente agregado");
    }

    public void eliminar(Paciente p) {      // Con remove() nos permite eliminar valores de la lista, si la condición nos da
    if (listaPacientes.remove(p)) {
        System.out.println("Paciente eliminado");
    } else {
        System.out.println("No hay paciente seleccionado");
    }
    }

   public Paciente buscar(int dni) {
    return listaPacientes.stream()
                .filter(paciente -> paciente.getF_dni()== dni) // Filtra y evalua si el dni del paciente ingresado es valido con el argumento dni.
                .findFirst() // Busca el primer paciente que cumple la condición
                .orElse(null); // Devuelve null si no encuentra el paciente.

   //Una función lambda es una subrutina definida que no está enlazada. Las utilizamos en los filtros en los arraylist.
   }

    public List<Paciente> listarPacientes() {
        return this.listaPacientes; //Devuelve la lista completa de pacientes almacenados en el ArrayList
    }
}

