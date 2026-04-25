package polimorfismo;

// Clase base producto
public class Producto {

    protected String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
    }

}
