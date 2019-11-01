package ejercicio7.Decorator;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public abstract class Decorator implements Cuenta {
    private Cuenta cuenta;
    public Decorator(Cuenta cuenta){
        setCuenta(cuenta);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta= cuenta;
    }

}
