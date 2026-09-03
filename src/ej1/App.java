public class App {
    public static void main(String[] args) {


        EventoUniversitario charla = new EventoUniversitario("0001", "Evento de la SAE", 1500.0, true);
        EventoUniversitario taller = new EventoUniversitario("0002", "Taller de programcion", 2000.0, false);

        EventoUniversitario copiaCharla = new EventoUniversitario(charla);
        EventoUniversitario copiaTaller = new EventoUniversitario(taller);


        System.out.println("Eventos universitarios");
        charla.mostrarDatos();
        taller.mostrarDatos();

        System.out.println("copias");
        copiaCharla.mostrarDatos();
        copiaTaller.mostrarDatos();


        System.out.println("Total de eventos: " + EventoUniversitario.getCantidadEventos());
    }
}