public class Rectángulo extends Forma implements Redimensionable, Comparable<Rectángulo> {
    private double ancho;
    private double alto;

    public Rectángulo(int numLados, double ancho, double alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2 * (ancho + alto);
    }

    @Override
    public String toString() {
        return "Rectángulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", area=" + getArea()+
        '}';
    }

    @Override
    public double redimensionar(int x) {
        this.ancho *= x;
        this.alto *= x;
        return getArea();
    }

    @Override
    public int compareTo(Rectángulo o) {
        int resultao = 0;
        if (getArea() < o.getArea()) {
            resultao = 1;
        } else if (getArea() > o.getArea()) {
            resultao = -1;
        } else {
            if (getArea() < o.getArea()) {
                resultao = 1;
            } else if (getArea() > o.getArea()) {
                resultao = -1;
            } else {
                resultao = 0;
            }



        }return resultao;
    }}
