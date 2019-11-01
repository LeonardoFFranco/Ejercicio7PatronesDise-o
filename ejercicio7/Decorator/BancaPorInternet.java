package ejercicio7.Decorator;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class BancaPorInternet extends Decorator {

    public BancaPorInternet(Cuenta cuenta){
        super(cuenta);
    }


    @Override
    public void operacion(){
        getCuenta().operacion();
        System.out.println("Se habilito la paga por internet");
    }

    @Override
    public int getMonto() {
        return getCuenta().getMonto();
    }


}
