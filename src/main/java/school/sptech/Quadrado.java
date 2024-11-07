package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    @Override
    public Double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
