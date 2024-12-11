package HASHSET;
import CLASES.Cita;
import java.util.HashSet;

public class CitaSet {
    
private HashSet<Cita> citas; //reamos el hahsset.

    public CitaSet(HashSet<Cita> citas) {       //Constructor.
        this.citas = citas;
    }

    public boolean agregar(Cita cita) {
        if (citas.add(cita)) { // HashSet evitará duplicados automáticamente.
            System.out.println("Cita agregada");    // Si es correcta.
            return true;
        } else {        // Si es falsa.
            System.out.println("Cita duplicada. No se agregó");
            return false;
        }
    }

    public boolean eliminar(Cita cita) { // Si el conjunto existe se eliminara.
        if (citas.remove(cita)) {
            System.out.println("Cita eliminada");
            return true;
        } else {        //En caso no este.
            System.out.println("La cita no existe");
            return false;
        }
    }

    public Cita Buscar(int numeroCita) {    //Buscara segun el numero de cita.
        return citas.stream()
                .filter(cita -> cita.getF_numeroCita() == numeroCita)
                .findFirst()
                .orElse(null);
    }

    public void listar() {      //Muestra todas las citas no garantiza el orden.
        System.out.println("Citas registradas:");
        for (Cita cita : citas) {
            System.out.println("- Número: " + cita.getF_numeroCita() + ", Motivo: " + cita.getF_motivoCita() +
                               ", Fecha: " + cita.getF_fechaCita());
        }
    }
    }