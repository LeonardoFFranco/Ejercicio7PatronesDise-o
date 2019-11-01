package ejercicio7.Proxy;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class ServerOficial implements IServer {
    String archivo;
    public ServerOficial(String archivo){
        this.archivo= archivo;
    };
    @Override
    public void descarga() {
        System.out.println("Se descargo el archivo: "+this.archivo);
    }

    @Override
    public void carga(){
        System.out.println("Se cargo el archivo: "+this.archivo);
    }
}
