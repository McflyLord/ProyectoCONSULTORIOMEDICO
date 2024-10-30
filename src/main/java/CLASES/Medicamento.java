package CLASES;

public class Medicamento {
    private String nombre;
    private String dosis;
    private String frecuencia;
    private String via;

    public Medicamento(String nombre, String dosis, String frecuencia, String via) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.via = via;
    }

    public Medicamento(String paracetamol, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public void registrarMedicamento() {
    }

    public void obtenerInformacion() {
    }
}
