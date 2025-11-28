// Archivo: Tiempo2.java (Este es el archivo que falta)
public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor que usa Ordenamiento3.java
    public Tiempo2(int h, int m, int s) {
        // (Aquí iría la validación de que h, m, s sean correctos)
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    // Métodos que usa ComparadorTiempo.java
    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    // Método necesario para que System.out.printf funcione bien
    @Override
    public String toString() {
        // Formatea la hora como "HH:MM:SS"
        return String.format("%02d:%02d:%02d", 
            obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }
}
