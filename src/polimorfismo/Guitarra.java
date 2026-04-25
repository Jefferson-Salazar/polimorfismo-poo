package polimorfismo;

// Hereda de Instrumento
public class Guitarra extends Instrumento {

    @Override
    public void tocar() {
        System.out.println("La guitarra suena: Trin Trin.");
    }

}
