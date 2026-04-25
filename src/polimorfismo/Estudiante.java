package polimorfismo;

// Hereda de Persona
public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Estudiante: " + getNombre() + " | Carrera: " + carrera);
    }

}
