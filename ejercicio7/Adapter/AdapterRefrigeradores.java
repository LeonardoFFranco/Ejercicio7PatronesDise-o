package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class AdapterRefrigeradores implements EmpresaArtefactos1 {
    private Refrigeradores refrigeradores= new Refrigeradores();
    private int precio;
    private int tiempoDeVida;


    public AdapterRefrigeradores(Refrigeradores refrigeradores){
        this.refrigeradores= refrigeradores;
    }


    @Override
    public int precio() {
        precio =this.refrigeradores.getCosto();
        return precio;
    }

    @Override
    public int tiempoDeVida() {
        tiempoDeVida = this.refrigeradores.getTiempoDeGarantia();
        return tiempoDeVida;
    }



}
