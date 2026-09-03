
import java.util.ArrayList;
import java.util.List;

public class App {
    public static Integer id = 0;
    public static List<EventoUniversitario> eventos = new ArrayList<>();
    public static List<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        EventoUniversitario evento1 = new EventoUniversitario(((Integer) (eventos.size())).toString(),
                "Eventos de la UTN", 1000.00, true);
        EventoUniversitario evento2 = new EventoUniversitario(evento1);

        Estudiante efrain = new Estudiante("5063", "Efrain Fernandez");
        Estudiante wilson = new Estudiante("5403", "Wilson Barreto");
        estudiantes.add(efrain);
        estudiantes.add(wilson);

        eventos.add(evento1);
        eventos.add(evento2);

        evento1.crearActividad(1, "Charla de Ciberseguridad", 60);

        evento2.crearActividad(3, "Charla de Linux", 60);
       

        for (Estudiante estudiante : estudiantes) {
            for (EventoUniversitario evento : eventos) {
                for (Actividad actividad : evento.getActividades()) {
                    actividad.inscribir(estudiante);
                }
            }
        }

        for (EventoUniversitario evento : eventos) {
            evento.mostrarDatos();
        }

        System.out.println("Cantidad de eventos: " + EventoUniversitario.getCantidadEventos());
    }
}