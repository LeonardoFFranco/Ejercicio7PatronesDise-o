package ejercicio7.Visitor;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Client {
    public static void main(String [] args){

        Perro perro = new Perro();
        Gato gato = new Gato();
        Caballo caballo= new Caballo();

        Veterinario veterinario= new Veterinario();


        System.out.println(perro.accept(veterinario));
        System.out.println(gato.accept(veterinario));
        System.out.println(caballo.accept(veterinario));

    }
}
