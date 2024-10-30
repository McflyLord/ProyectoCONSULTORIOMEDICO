package CLASES;

import java.sql.Time;

public class Horario {
    private Time inicio;
    private Time fin;

    public Horario(Time inicio, Time fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Time getInicio() {
        return inicio;
    }

    public void setInicio(Time inicio) {
        this.inicio = inicio;
    }

    public Time getFin() {
        return fin;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }

    public void establecerHorario() {
    }

    public void obtenerHorario() {
    }
}
