package CLASES;
import java.util.Date;
import java.util.Objects;

public class Cita {
    private int F_numeroCita;
    private Date F_fechaCita;
    private Date F_horaCita;
    private String F_motivoCita;

    public Cita(int F_numeroCita, Date F_fechaCita, Date F_horaCita, String F_motivoCita) {
        this.F_numeroCita = F_numeroCita;
        this.F_fechaCita = F_fechaCita;
        this.F_horaCita = F_horaCita;
        this.F_motivoCita = F_motivoCita;
    }

    public int getF_numeroCita() {
        return F_numeroCita;
    }

    public void setF_numeroCita(int F_numeroCita) {
        this.F_numeroCita = F_numeroCita;
    }

    public Date getF_fechaCita() {
        return F_fechaCita;
    }

    public void setF_fechaCita(Date F_fechaCita) {
        this.F_fechaCita = F_fechaCita;
    }

    public Date getF_horaCita() {
        return F_horaCita;
    }

    public void setF_horaCita(Date F_horaCita) {
        this.F_horaCita = F_horaCita;
    }

    public String getF_motivoCita() {
        return F_motivoCita;
    }

    public void setF_motivoCita(String F_motivoCita) {
        this.F_motivoCita = F_motivoCita;
    }

    public void agendarCita() {
    }

    public void cancelarCita() {
    }
    //Metodos fundamentales que trabajan con HasSet, definen como comprar objetos.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return F_numeroCita == cita.F_numeroCita; // Comparar por número de cita
    }

    @Override
    public int hashCode() {
        return Objects.hash(F_numeroCita); // Generar hash basado en número de cita
    }
}
