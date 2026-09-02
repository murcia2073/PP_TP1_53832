
public class EventoUniversitario {


    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;


    private static int cantidadEventos = 0;

    /// constructoo
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;

        cantidadEventos++; //contador sube
    }


    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;

        cantidadEventos++;
    }




    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0.0;
        }
        return costoBase;
    }


    public void mostrarDatos() {
        System.out.println("Datos del evento");
        System.out.println("ID: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("¿Es gratis?: " + (gratuito ? "Sí" : "No"));
        System.out.println("Costo estimado: " + calcularCostoEstimado() +"$");
    }

    ///meto estatico
    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
 