package ejercicio7.Visitor;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public interface IVisitor {
    public double visit(Perro perro);
    public double visit(Gato gato);
    public double visit(Caballo caballo);
}
