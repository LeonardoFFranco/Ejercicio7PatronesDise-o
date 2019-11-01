package ejercicio7.Visitor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Veterinario implements IVisitor {
    Date date= new Date();
    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

    @Override
    public double visit(Perro perro) {
        perro.getEnfermedad();
        System.out.println("Se atendio al perro el: "+hourdateFormat.format(date));
        return 0;
    }

    @Override
    public double visit(Gato gato) {
        gato.getEnfermedad();
        System.out.println("Se atendio al gato el: "+hourdateFormat.format(date));
        return 0;
    }

    @Override
    public double visit(Caballo caballo) {
        caballo.getEnfermedad();
        System.out.println("Se atendio al caballo el: "+hourdateFormat.format(date));
        return 0;
    }
}
