package ej3;

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
        double costoActividades = 0;
        for (Actividad actividad : actividades) {
            costoActividades += actividad.calcularCostoMateriales();
        }
        return (costoBase + costoActividades) * 1.21;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    // Sobrecarga para crear una Charla: recibe el tipo ("Charla") y el disertante.
    public void crearActividad(int id, String titulo, int cupo, String tipo, String disertante) {
        if (!tipo.equalsIgnoreCase("Charla")) {
            System.out.println("Tipo de actividad invalido para este metodo: " + tipo);
            return;
        }
        actividades.add(new Charla(id, titulo, cupo, disertante));
    }


    public void crearActividad(int id, String titulo, int cupo, String tipo, boolean requiereNotebook) {
        if (!tipo.equalsIgnoreCase("Taller")) {
            System.out.println("Tipo de actividad invalido para este metodo: " + tipo);
            return;
        }
        actividades.add(new Taller(id, titulo, cupo, requiereNotebook));
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