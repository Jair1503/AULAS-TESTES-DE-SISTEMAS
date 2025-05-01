import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Retangulo> retangulos = new ArrayList<>();
        {

            Retangulo retangulo1 = new Retangulo(20, 10);
            Retangulo retangulo2 = new Retangulo(15, 12);
            Retangulo retangulo3 = new Retangulo(25, 6);
            Retangulo retangulo4 = new Retangulo(40, 32);
            Retangulo retangulo5 = new Retangulo(18, 36);

            System.out.println("\nAltura : " + retangulo1.getAltura() +
                    "\nLargura : " + retangulo1.getLargura() +
                    "\nÁrea : " + retangulo1.calcularArea() +
                    "\nPerímetro : " + retangulo1.calcularPerimetro() + "\n");

            System.out.println("Altura : " + retangulo2.getAltura() +
                    "\nLargura : " + retangulo2.getLargura() +
                    "\nÁrea : " + retangulo2.calcularArea() +
                    "\nPerímetro : " + retangulo2.calcularPerimetro() + "\n");

            System.out.println("Altura : " + retangulo3.getAltura() +
                    "\nLargura : " + retangulo3.getLargura() +
                    "\nÁrea : " + retangulo3.calcularArea() +
                    "\nPerímetro : " + retangulo3.calcularPerimetro() + "\n");

            System.out.println("Altura : " + retangulo4.getAltura() +
                    "\nLargura : " + retangulo4.getLargura() +
                    "\nÁrea : " + retangulo4.calcularArea() +
                    "\nPerímetro : " + retangulo4.calcularPerimetro() + "\n");


            System.out.println("Altura : " + retangulo5.getAltura() +
                    "\nLargura : " + retangulo5.getLargura() +
                    "\nÁrea : " + retangulo5.calcularArea() +
                    "\nPerímetro : " + retangulo5.calcularPerimetro());

            System.out.println("Lista de Retângulos");
            for (Retangulo retangulo : retangulos) ;
            System.out.println(Retangulo.calcularArea());

            Retangulo maiorArea = MaiorRetangulo.encontrarMaiorArea(retangulos);
            Retangulo maiorPerimetro = MaiorRetangulo.encontraMaiorPerimetro(retangulos);
            System.out.println("Retângulo com maior Área: " + maiorArea);
            System.out.println("Retângulo com maior perímetro: " + maiorPerimetro);
        }
    }

}