package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class AdapterLavadoras implements EmpresaArtefactos1 {
    private Lavadoras lavadoras= new Lavadoras();
    private int precio;
    private int tiempoDeVida;


    public AdapterLavadoras(Lavadoras lavadoras){
        this.lavadoras= lavadoras;
    }


    @Override
    public int precio() {
        precio =this.lavadoras.getCosto();
        return precio;
    }

    @Override
    public int tiempoDeVida() {
        tiempoDeVida = this.lavadoras.getTiempoDeGarantia();
        return tiempoDeVida;
    }



}
