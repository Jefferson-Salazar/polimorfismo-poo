package polimorfismo;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1 ===");
        Animal animal = new Perro();
        animal.hacerSonido();

        System.out.println("\n=== EJERCICIO 2 ===");
        Figura figura = new Rectangulo(5, 4);
        System.out.println("Área: " + figura.area());

        System.out.println("\n=== EJERCICIO 3 ===");
        Empleado emp = new Vendedor("Jefferson", 500);
        emp.resumen();

        System.out.println("\n=== EJERCICIO 4 ===");
        Cuenta cuenta = new CuentaAhorro(1000);
        cuenta.depositar(500);
        
        System.out.println("\n=== EJERCICIO 5 ===");
        Transporte t = new Avion();
        t.mover();

        System.out.println("\n=== EJERCICIO 6 ===");
        Persona p = new Estudiante("Jefferson", "Ingeniería en Sistemas");
        p.mostrarRol();

        System.out.println("\n=== EJERCICIO 7 ===");
        Vehiculo v = new Motocicleta();
        v.arrancar();

    }

}
