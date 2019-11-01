package ejercicio7.Bridge;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Client {
    public static void main(String [] args){
        Euros euros = new Euros();
        Ahorro ahorro = new Ahorro(euros);
        ahorro.setMonto(500);
        System.out.println("El monto con tipo de cuenta Ahorro y tipo de moneda en Euros es: "+ahorro.sacarInteres()+"Bs");

        Dolares dolares = new Dolares();
        PlazoFijo plazoFijo= new PlazoFijo(dolares);
        plazoFijo.setMonto(100);
        System.out.println("El monto con tipo de cuenta Plazo Fijo y tipo de moneda en Dolares es: "+plazoFijo.sacarInteres()+"Bs");

        Bolivianos bolivianos = new Bolivianos();
        Credito credito= new Credito(bolivianos);
        credito.setMonto(200);
        System.out.println("El monto con tipo de cuenta Credito y tipo de moneda en Bolivianos es: "+credito.sacarInteres()+"Bs");
    }
}
