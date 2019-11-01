package ejercicio7.Decorator;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class CuentaBancoBasica implements Cuenta{
    private int monto=1000;
    private String nombrePropietario="Alguien";


    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
     public void operacion() {
        System.out.println("Cuenca Banco Basica, Monto=" + getMonto() + ", Nombre=" + getNombrePropietario());
    }

    @Override
    public int getMonto(){
        return monto;
    }



}
