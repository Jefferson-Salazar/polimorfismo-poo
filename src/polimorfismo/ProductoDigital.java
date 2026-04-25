package polimorfismo;

// Hereda de Producto
public class ProductoDigital extends Producto {

    private double tamanoMB;

    public ProductoDigital(String nombre, double tamanoMB) {
        super(nombre);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto digital: " + nombre + " | Tamaño: " + tamanoMB + " MB");
    }

}