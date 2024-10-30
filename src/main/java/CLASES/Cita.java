package CLASES;

import java.util.Date;

public class Cita {
    private int numeroCita;
    private Date fechaCita;
    private String horaCita;
    private String motivoCita;
    private Paciente paciente;
    private Medico medico;

    public Cita(int numeroCita, Date fechaCita, String horaCita, String motivoCita, Paciente paciente, Medico medico) {
        this.numeroCita = numeroCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivoCita = motivoCita;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivoCita() {
        return motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
    public void agendarCita() {
    }

    public void cancelarCita() {
    }

    public void modificarCita() {
    }
}
