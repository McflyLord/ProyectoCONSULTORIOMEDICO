package CLASES;

import java.util.Date;

public class CitaVirtual extends Cita {
    private String link;

    public CitaVirtual(String link, int numeroCita, Date fechaCita, String horaCita, String motivoCita, Paciente paciente, Medico medico) {
        super(numeroCita, fechaCita, horaCita, motivoCita, paciente, medico);
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public void agendarCita() {
    }
}
