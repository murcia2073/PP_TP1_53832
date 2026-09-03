package ej2;

import java.time.LocalDate;

public class Inscripcion {

    private Estudiante estudiante;
    private LocalDate fecha;
    private String estado;

    public Inscripcion(Estudiante estudiante, LocalDate fecha, String estado) {
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }
    @Override
    public String toString() {
        return estudiante.getNombre() + " -> " + estado + " el " + fecha;
    }
}
