package CLASES;

import java.util.List;

public class HistorialMedico {
    private Paciente paciente;
    private List<Registro> registros;

    public HistorialMedico(Paciente paciente, List<Registro> registros) {
        this.paciente = paciente;
        this.registros = registros;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public void agregarRegistro() {
    }

    public void consultarHistorial() {
    }
}
