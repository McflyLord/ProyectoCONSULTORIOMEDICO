package CLASES;
import java.util.Date;

public class Observacion {
   private String F_descripcion;
    private Date F_fecha;

    public Observacion(String F_descripcion, Date F_fecha) {
        this.F_descripcion = F_descripcion;
        this.F_fecha = F_fecha;
    }

    public String getF_descripcion() {
        return F_descripcion;
    }

    public void setF_descripcion(String F_descripcion) {
        this.F_descripcion = F_descripcion;
    }

    public Date getF_fecha() {
        return F_fecha;
    }

    public void setF_fecha(Date F_fecha) {
        this.F_fecha = F_fecha;
    }

    public void agregarRegistro() {
    }
}

