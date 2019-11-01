package ejercicio7.Bridge;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Dolares implements Monedas {

    @Override
    public int convertirABolivianos(int monto) {
        return monto*7;
    }
}
