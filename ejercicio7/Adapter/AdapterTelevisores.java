package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class AdapterTelevisores implements EmpresaArtefactos1 {
    private Televisores televisores= new Televisores();
    private int precio;
    private int tiempoDeVida;


    public AdapterTelevisores(Televisores televisores){
        this.televisores= televisores;
    }


    @Override
    public int precio() {
        precio =this.televisores.getCosto();
        return precio;
    }

    @Override
    public int tiempoDeVida() {
        tiempoDeVida = this.televisores.getTiempoDeGarantia();
        return tiempoDeVida;
    }



}
