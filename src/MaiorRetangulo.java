import java.util.List;

public class MaiorRetangulo {
    public static Retangulo encontrarMaiorArea(List<Retangulo> retangulos) {
        Retangulo maior = null;
        double maiorArea = 0;

        for (Retangulo r : retangulos) {
            double area = r.calcularArea();
            if (area > maiorArea) {
                maior = r;
            }
        }
        return maior;
    }

    public static Retangulo encontraMaiorPerimetro(List<Retangulo> retangulos) {
        Retangulo maior = null;
        double maiorPerimetro = 0;

        for (Retangulo r : retangulos) {
            double perimetro = r.calcularPerimetro();
            if (perimetro > maiorPerimetro) {
                maiorPerimetro = perimetro;
                maior = r;
            }
        }
        return maior;
    }
}
