package CLASES;

import java.util.Date;

public class Receta {
    private Medicamento medicamento;
    private Date fechaEmision;

    public Receta(Medicamento medicamento, Date fechaEmision) {
        this.medicamento = medicamento;
        this.fechaEmision = fechaEmision;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void crearReceta() {
    }
}
