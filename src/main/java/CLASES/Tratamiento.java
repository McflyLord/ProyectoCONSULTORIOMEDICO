package CLASES;

public class Tratamiento {
    private String descripcion;
    private int duracion;

    public Tratamiento(String descripcion, int duracion) {
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void empezarTratamiento() {
    }
}
