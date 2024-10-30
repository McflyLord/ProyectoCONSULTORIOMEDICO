package ARRAYLIST;
import java.util.ArrayList;
import java.util.List;
import CLASES.Tratamiento;

public class TratamientoList {
    List<Tratamiento> listaTratamientos = new ArrayList<>(); 

    public void agregarTratamiento(Tratamiento t) {
        listaTratamientos.add(t);
    }

    public void eliminarTratamiento(Tratamiento t) {
        listaTratamientos.remove(t);
    }

    public Tratamiento buscarTratamiento(String descripcion) {
        for (Tratamiento t : listaTratamientos) {
            if (t.getDescripcion().equalsIgnoreCase(descripcion)) {
                return t;
            }
        }
        return null;
    }

    public void mostrarTratamiento(Tratamiento t) {
        System.out.println("Descripción: " + t.getDescripcion() + ", Duración: " + t.getDuracion() + " días");
    }

    public void listarTratamientos() {
        for (Tratamiento t : listaTratamientos) {
            mostrarTratamiento(t);
        }
    }
}
