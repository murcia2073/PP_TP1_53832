package ej2;
public class Estudiante {
    private String legajo;
    private String nombre;

    public Estudiante(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }
    public String getLegajo() {

        return legajo;
    }

    public String getNombre() {
        return nombre;
    }
}