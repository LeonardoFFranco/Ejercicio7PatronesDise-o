package ejercicio7.Visitor;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public interface IAnimales {
    public double accept(IVisitor visitor);
    public String enfermedad();
}
