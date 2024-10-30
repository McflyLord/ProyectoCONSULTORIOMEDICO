package CLASES;

import java.util.Date;

public class CitaPresencial extends Cita {
    private String consultorio;

    public CitaPresencial(String consultorio, int numeroCita, Date fechaCita, String horaCita, String motivoCita, Paciente paciente, Medico medico) {
        super(numeroCita, fechaCita, horaCita, motivoCita, paciente, medico);
        this.consultorio = consultorio;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public void agendarCita() {
    }
}
