package CLASES;
import java.util.ArrayList;

public class Historial {
    private String F_fechaCreacion;
    private ArrayList<Registro> F_registros = new ArrayList<>();

    public Historial(String F_fechaCreacion) {
        this.F_fechaCreacion = F_fechaCreacion;
    }

    public String getF_fechaCreacion() {
        return F_fechaCreacion;
    }

    public void setF_fechaCreacion(String F_fechaCreacion) {
        this.F_fechaCreacion = F_fechaCreacion;
    }

    public ArrayList<Registro> getF_registros() {
        return F_registros;
    }

    public void setF_registros(ArrayList<Registro> F_registros) {
        this.F_registros = F_registros;
    }

    public void agregarRegistro(Registro registro) {
        F_registros.add(registro);
    }

    public void eliminarRegistro(Registro registro) {
        F_registros.remove(registro);
    }
}

