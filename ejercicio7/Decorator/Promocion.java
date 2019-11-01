package ejercicio7.Decorator;

import prototype.Main;

import java.util.Random;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Promocion extends Decorator{
    public int seguro;

    public Promocion(Cuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void operacion() {
        getCuenta().operacion();
    }

    public int getMonto() {
        int random = (int)(Math.random()*10);
        if(random%2==0){
            int ganar=getCuenta().getMonto()*2;
            System.out.println("Gano la promocion el Monto ahora es de " + ganar);
            return ganar;
        }else {
            System.out.println("No gano la promocion el Monto sigue siendo " + getCuenta().getMonto());
            return getCuenta().getMonto();
        }
    }
}
