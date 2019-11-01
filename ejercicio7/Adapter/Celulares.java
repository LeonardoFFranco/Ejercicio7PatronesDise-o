package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Celulares implements EmpresaArtefactos1{
    private int precio;
    private int tiempoDeVida;

    @Override
    public int precio() {
        return getPrecio();
    }

    @Override
    public int tiempoDeVida() {
        return getTiempoDeVida();
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }
}
