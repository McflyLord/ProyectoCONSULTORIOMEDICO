package CLASES;
import java.util.Date;

public class CitaPresencial extends Cita {
    private String F_consultorio;

    public CitaPresencial(int F_numeroCita, Date F_fechaCita, Date F_horaCita, String F_motivoCita) {
        super(F_numeroCita, F_fechaCita, F_horaCita, F_motivoCita);
    }

    public String getF_consultorio() {
        return F_consultorio;
    }

    public void setF_consultorio(String F_consultorio) {
        this.F_consultorio = F_consultorio;
    }

    @Override
    public void agendarCita() {
    }
}
