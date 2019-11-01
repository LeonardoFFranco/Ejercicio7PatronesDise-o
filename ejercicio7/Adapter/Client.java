package ejercicio7.Adapter;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Client {
    public static void main(String [] args){


        Celulares celulares = new Celulares();
        celulares.setPrecio(500);
        celulares.setTiempoDeVida(365);

        Televisores televisores = new Televisores();
        televisores.setCosto(450);
        televisores.setTiempoDeGarantia(200);

        Refrigeradores refrigeradores = new Refrigeradores();
        refrigeradores.setTiempoDeGarantia(120);

        Lavadoras lavadoras = new Lavadoras();
        lavadoras.setCosto(800);


        AdapterTelevisores adapterTelevisores = new AdapterTelevisores(televisores);
        System.out.println(adapterTelevisores.precio());

        AdapterRefrigeradores adapterRefrigeradores = new AdapterRefrigeradores(refrigeradores);
        System.out.println(adapterRefrigeradores.tiempoDeVida());

        AdapterLavadoras adapterLavadoras = new AdapterLavadoras(lavadoras);
        System.out.println(adapterLavadoras.precio());
    }
}
