import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {

    private static int cantidadEventos = 0;

    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private Sala sala;
    private List<Actividad> actividades;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        cantidadEventos++;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;
        this.actividades = new ArrayList<>(otro.actividades);
        cantidadEventos++;
    }

    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0;
        }
        return costoBase + (actividades.size() * 500);
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo) {
        actividades.add(new Actividad(id, titulo, cupo));
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Costo Base: " + costoBase);
        System.out.println("Gratuito: " + gratuito);
        System.out.println("Costo Final: " + calcularCostoEstimado());
        System.out.println("Sala: " + sala);
        System.out.println("Actividades: ");
        System.out.println();

        for (Actividad actividad : actividades) {
            actividad.mostrarDatos();
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}