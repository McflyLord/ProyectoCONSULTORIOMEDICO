package CLASES;

public class Tratamiento {
     private String F_descripcion;
    private int F_duracion;

    public Tratamiento(String F_descripcion, int F_duracion) {
        this.F_descripcion = F_descripcion;
        this.F_duracion = F_duracion;
    }

    public String getF_descripcion() {
        return F_descripcion;
    }

    public void setF_descripcion(String F_descripcion) {
        this.F_descripcion = F_descripcion;
    }

    public int getF_duracion() {
        return F_duracion;
    }

    public void setF_duracion(int F_duracion) {
        this.F_duracion = F_duracion;
    }

    public void agregarRegistro() {
    }
}
