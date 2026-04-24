package polimorfismo;

// Hereda de Animal y sobrescribe método
public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau Guau");
    }

}
