package CLASES;

import java.util.Date;

public class Registro {
    private Date fecha;
    private String descripcion;
    private String tipo;

    public Registro(Date fecha, String descripcion, String tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void registrarRegistro() {
    }

    public void obtenerDetalles() {
    }
}
