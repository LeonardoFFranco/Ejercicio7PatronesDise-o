package ejercicio7.Visitor;

/**
 * Created by WINDOWS 8.1 on 01/11/2019.
 */
public class Perro implements IAnimales {
    private String enfermedad;

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String enfermedad() {
        return enfermedad;
    }
}
