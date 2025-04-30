import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(20, 10);
        System.out.println("\nAltura : "+ retangulo1.getAltura() +
            "\nLargura : "+ retangulo1.getLargura() +
            "\nÁrea : "+ retangulo1.calcularArea() +
            "\nPerímetro : "+ retangulo1.calcularPerimetro() + "\n");

        Retangulo retangulo2 = new Retangulo(15, 12);
        System.out.println("Altura : "+ retangulo2.getAltura() +
                "\nLargura : "+ retangulo2.getLargura() +
                "\nÁrea : "+ retangulo2.calcularArea() +
                "\nPerímetro : "+ retangulo2.calcularPerimetro() + "\n");

        Retangulo retangulo3 = new Retangulo(25, 6);
        System.out.println("Altura : "+ retangulo3.getAltura() +
                "\nLargura : "+ retangulo3.getLargura() +
                "\nÁrea : "+ retangulo3.calcularArea() +
                "\nPerímetro : "+ retangulo3.calcularPerimetro() + "\n");

        Retangulo retangulo4 = new Retangulo(40, 32);
        System.out.println("Altura : "+ retangulo4.getAltura() +
                "\nLargura : " + retangulo4.getLargura() +
                "\nÁrea : " + retangulo4.calcularArea() +
                "\nPerímetro : " + retangulo4.calcularPerimetro() + "\n");

        Retangulo retangulo5 = new Retangulo(18, 36);
        System.out.println("Altura : "+ retangulo5.getAltura() +
                "\nLargura : "+ retangulo5.getLargura() +
                "\nÁrea : " + retangulo5.calcularArea() +
                "\nPerímetro : "+ retangulo5.calcularPerimetro());
    }
}
