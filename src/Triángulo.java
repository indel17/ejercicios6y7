public class Triángulo extends Forma {
    private double base;
    private double altura;

    public Triángulo(int numLados, double base, double altura) {
        super(numLados);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
    return (base * altura) / 2;
}

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "numLados=" + getNumLados() +
                ", area=" + getArea() +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

}