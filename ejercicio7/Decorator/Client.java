package ejercicio7.Decorator;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Client {
    public static void main(String[] args) {
        Cuenta  cuentaBancaria= new CuentaBancoBasica();
        cuentaBancaria = new BancaPorInternet(cuentaBancaria);
        cuentaBancaria=new SeguroDeLaCuenta(cuentaBancaria,50);
        cuentaBancaria=new Promocion(cuentaBancaria);
        cuentaBancaria.operacion();
        cuentaBancaria.getMonto();

    }
}
