package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {

    }

    public Imagem(List<Figura> figuras) {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaTotalAreas = 0.0;

        for (Figura figura : figuras) {
            somaTotalAreas += figura.calcularArea();
        }

        return somaTotalAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaiorQue20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20.0) {
                figurasMaiorQue20.add(figura);
            }
        }

        return figurasMaiorQue20;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> figurasQuadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                figurasQuadrados.add(figura);
            }
        }

        return figurasQuadrados;
    }
}
