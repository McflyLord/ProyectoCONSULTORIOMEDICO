package CLASES;
import java.util.Date;

public class Registro {
    private Date F_fechaRegistro;
    private Tratamiento F_tratamiento;
    private Observacion F_observacion;
    private Receta F_receta;

    public Registro(Date F_fechaRegistro, Tratamiento F_tratamiento, Observacion F_observacion, Receta F_receta) {
        this.F_fechaRegistro = F_fechaRegistro;
        this.F_tratamiento = F_tratamiento;
        this.F_observacion = F_observacion;
        this.F_receta = F_receta;
    }

    public Date getF_fechaRegistro() {
        return F_fechaRegistro;
    }

    public void setF_fechaRegistro(Date F_fechaRegistro) {
        this.F_fechaRegistro = F_fechaRegistro;
    }

    public Tratamiento getF_tratamiento() {
        return F_tratamiento;
    }

    public void setF_tratamiento(Tratamiento F_tratamiento) {
        this.F_tratamiento = F_tratamiento;
    }

    public Observacion getF_observacion() {
        return F_observacion;
    }

    public void setF_observacion(Observacion F_observacion) {
        this.F_observacion = F_observacion;
    }

    public Receta getF_receta() {
        return F_receta;
    }

    public void setF_receta(Receta F_receta) {
        this.F_receta = F_receta;
    }

    public void obtenerRegistro() {

    }

    public void eliminarRegistro() {
    }
}
