package ejercicio7.Bridge;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Credito implements Cuentas {
    private int monto;
    private Monedas monedas;

    public Credito(Monedas monedas) {
        this.monedas = monedas;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int sacarInteres() {
        return getMonto();
    }
}
