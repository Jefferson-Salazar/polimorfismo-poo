package polimorfismo;

// Hereda de Trabajador
public class TrabajadorPorHora extends Trabajador {

    private int horas;
    private double pagoHora;

    public TrabajadorPorHora(int horas, double pagoHora) {
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    public double calcularPago() {
        return horas * pagoHora;
    }

}