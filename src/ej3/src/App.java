package ej3;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante efrain = new Estudiante("Efrain Fernandez", "5063");
        Estudiante wilson = new Estudiante("Wilson Barreto", "5403");
        Estudiante lucia = new Estudiante("Carolina Murcia", "5510");
        estudiantes.add(efrain);
        estudiantes.add(wilson);
        estudiantes.add(lucia);


        EventoUniversitario evento1 = new EventoUniversitario("1", "Semana de la Tecnologia", 1000.00, false);
        EventoUniversitario evento2 = new EventoUniversitario(evento1); // Copia de evento1


        evento1.asignarSala(new Sala(101, "Auditorio Principal"));
        evento2.asignarSala(new Sala(205, "Laboratorio 1"));

        // d. Crear actividades propias de cada evento
        evento1.crearActividad(1, "Charla de Ciberseguridad", 60, "Charla", "Terry Davis");
        evento1.crearActividad(2, "Taller de Python", 30, "Taller", true);


        for (Actividad actividad : evento1.getActividades()) {
            actividad.inscribir(efrain);
            actividad.inscribir(wilson);
            actividad.inscribir(lucia);
        }


        System.out.println("Datps evento 1:");
        evento1.mostrarDatos();

        System.out.println("datos evento copia===");
        evento2.mostrarDatos();


        System.out.println("\nTotal de eventos creados: " + EventoUniversitario.getCantidadEventos());
    }
}