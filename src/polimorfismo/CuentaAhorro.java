package polimorfismo;

// Hereda de Cuenta
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto + (monto * 0.05);
        System.out.println("Saldo con interés: Q" + saldo);
    }

}
