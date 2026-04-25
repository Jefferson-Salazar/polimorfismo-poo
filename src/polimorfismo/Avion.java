package polimorfismo;

// Hereda de Transporte
public class Avion extends Transporte {

    @Override
    public void mover() {
        System.out.println("El avión vuela por el aire.");
    }

}