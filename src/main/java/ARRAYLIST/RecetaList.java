package ARRAYLIST;
import CLASES.Medicamento;
import CLASES.Receta;
import java.util.ArrayList;
import java.util.List;

public class RecetaList {
    List<Receta> listaRecetas = new ArrayList<>(); 

    public void agregarReceta(Receta r) {
        listaRecetas.add(r);
        System.out.println("Receta agregada: " + r.getMedicamento().getNombre());
    }

    public void eliminarReceta(Receta r) {
        if (listaRecetas.remove(r)) {
            System.out.println("Receta eliminada: " + r.getMedicamento().getNombre());
        } else {
            System.out.println("La receta no se encontro");
        }
    }

    public Receta buscarReceta(Medicamento m) {
        for (Receta r : listaRecetas) {
            if (r.getMedicamento().equals(m)) {
                return r;
            }
        }
        return null;
    }

    public void listarRecetas() {
        if (listaRecetas.isEmpty()) {
            System.out.println("No hay recetas");
        } else {
            System.out.println("Lista de Recetas:");
        }
    }
}
