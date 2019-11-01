package ejercicio7.Decorator;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class SeguroDeLaCuenta extends Decorator {
    public int seguro;

    public SeguroDeLaCuenta(Cuenta cuenta,int seguro) {
        super(cuenta);
        this.seguro=seguro;
    }

    @Override
    public void operacion() {
        getCuenta().operacion();
    }

    public int getMonto() {
        int descuenta=getCuenta().getMonto()-seguro;

        System.out.println("Por el seguro el Monto ahora es de " + descuenta);
        return descuenta;
    }


}
