package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Televisores implements EmpresaArtefactos2 {
    private int costo;
    private int tiempoDeGarantia;


    @Override
    public int costo() {
        return costo;
    }

    @Override
    public int tiempoDeGarantia() {
        return tiempoDeGarantia;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }
}
