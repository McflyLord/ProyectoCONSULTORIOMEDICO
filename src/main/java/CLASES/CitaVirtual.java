package CLASES;
import java.util.Date;

public class CitaVirtual extends Cita {
    private String F_link;

    public CitaVirtual(int F_numeroCita, Date F_fechaCita, Date F_horaCita, String F_motivoCita) {
        super(F_numeroCita, F_fechaCita, F_horaCita, F_motivoCita);
    }

    public String getF_link() {
        return F_link;
    }

    public void setF_link(String F_link) {
        this.F_link = F_link;
    }

    @Override
    public void agendarCita() {
    }
}
