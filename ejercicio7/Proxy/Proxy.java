package ejercicio7.Proxy;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Proxy implements IServer{

    private String archivo;
    private ServerOficial realSubject=null;
    private ServerRespaldo respaldo=null;


    public Proxy(String archivo){
        this.archivo= archivo;
    }

    @Override
    public void descarga() {

        if(realSubject==null)
            realSubject = new ServerOficial(archivo);
            respaldo = new ServerRespaldo(archivo);


        String tipoArchivo = archivo.substring(archivo.length() - 4);
        //System.out.println(tipoArchivo);

        if (tipoArchivo.equals(".zip") || tipoArchivo.equals(".rar")) {
            this.realSubject.descarga();
            this.respaldo.descarga();

        }else{
            System.out.println("Solo se pueden descargar archivos de tipo .zip o .rar");
        }


    }

    @Override
    public void carga(){
        if(realSubject==null)
            realSubject = new ServerOficial(archivo);
        respaldo = new ServerRespaldo(archivo);


        String tipoArchivo = archivo.substring(archivo.length() - 4);

        if (tipoArchivo.equals(".zip") || tipoArchivo.equals(".rar")) {
            this.realSubject.carga();
            this.respaldo.carga();

        }else{
            System.out.println("Solo se pueden cargar archivos de tipo .zip o .rar");
        }
    }

}
