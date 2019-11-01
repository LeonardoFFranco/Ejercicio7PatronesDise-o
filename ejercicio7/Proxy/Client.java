package ejercicio7.Proxy;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Client {

    public static void main (String [] args){
        // create proxy
        IServer proxy = new Proxy("archivo.zip");
        proxy.descarga();

        IServer proxy2 = new Proxy("archivo2.rar");
        proxy2.carga();

        IServer proxy3 = new Proxy("archivo3.doc");
        proxy3.descarga();
    }
}
