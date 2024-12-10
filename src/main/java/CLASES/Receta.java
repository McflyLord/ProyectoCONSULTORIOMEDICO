package CLASES;

import java.util.Date;

public class Receta {
    private Date F_fechaEmision;
    private String F_medicamento;
    private String F_dosis;
    private String F_frecuencia;
    private String F_via;

    public Receta(Date F_fechaEmision, String F_medicamento, String F_dosis, String F_frecuencia, String F_via) {
        this.F_fechaEmision = F_fechaEmision;
        this.F_medicamento = F_medicamento;
        this.F_dosis = F_dosis;
        this.F_frecuencia = F_frecuencia;
        this.F_via = F_via;
    }

    public Date getF_fechaEmision() {
        return F_fechaEmision;
    }

    public void setF_fechaEmision(Date F_fechaEmision) {
        this.F_fechaEmision = F_fechaEmision;
    }

    public String getF_medicamento() {
        return F_medicamento;
    }

    public void setF_medicamento(String F_medicamento) {
        this.F_medicamento = F_medicamento;
    }

    public String getF_dosis() {
        return F_dosis;
    }

    public void setF_dosis(String F_dosis) {
        this.F_dosis = F_dosis;
    }

    public String getF_frecuencia() {
        return F_frecuencia;
    }

    public void setF_frecuencia(String F_frecuencia) {
        this.F_frecuencia = F_frecuencia;
    }

    public String getF_via() {
        return F_via;
    }

    public void setF_via(String F_via) {
        this.F_via = F_via;
    }

    public void agregarRegistro() {
    }
}
