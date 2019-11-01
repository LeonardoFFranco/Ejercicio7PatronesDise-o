package ejercicio7.Proxy;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class ServerRespaldo implements IServer{
    String archivo;
    public ServerRespaldo(String archivo){
        this.archivo= archivo;
    };
    @Override
    public void descarga() {
        System.out.println("Se hizo un respaldo de la descarga: "+this.archivo);
    }

    @Override
    public void carga(){
        System.out.println("Se hizo un respaldo de la carga: "+this.archivo);
    }
}
