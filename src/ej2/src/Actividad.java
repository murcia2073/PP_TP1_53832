package ej3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {

    public static final int CUPO_MINIMO = 5;

    private int id;
    private String titulo;
    private int cupoMaximo;
    private List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = Math.max(cupoMaximo, CUPO_MINIMO);
        this.inscripciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        if (inscripciones.size() >= cupoMaximo) {
            System.out.println("Uy, " + titulo + " ya no tiene lugar para " + estudiante.getNombre() + ".");
            return null;
        }
        Inscripcion inscripcion = new Inscripcion(estudiante, LocalDate.now(), "Confirmada");
        inscripciones.add(inscripcion);
        return inscripcion;
    }

    public void mostrarInscripciones() {
        for (int i = 0; i < inscripciones.size(); i++) {
            Inscripcion inscripcion = inscripciones.get(i);
            Estudiante estudiante = inscripcion.getEstudiante();
            System.out.println("Inscripcion numero " + i + ":");
            System.out.println("Estudiante: " + estudiante.getNombre() + " de legajo: " + estudiante.getLegajo());
        }
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Cupo Maximo: " + cupoMaximo);
        System.out.println("Cupos restantes: " + (cupoMaximo - inscripciones.size()));
        System.out.println("Inscripciones: " + inscripciones.size());
        mostrarInscripciones();
        System.out.println();
    }
}