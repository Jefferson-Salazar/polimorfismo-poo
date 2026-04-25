package polimorfismo;

// Clase base empleado
public class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void resumen() {
        System.out.println("Empleado: " + nombre);
    }

}
