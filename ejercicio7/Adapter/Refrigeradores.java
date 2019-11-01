package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Refrigeradores  implements EmpresaArtefactos2 {
    private int costo;
    private int tiempoDeGarantia;


    @Override
    public int costo() {
        return 0;
    }

    @Override
    public int tiempoDeGarantia() {
        return 0;
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

