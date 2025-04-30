public class Retangulo {
    private static double altura;
    private static double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public static double getAltura() {
        return altura;
    }

    public static double getLargura() {
        return largura;
    }
    public static double calcularArea(){
        return largura * altura;
    }
    public static double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retangulo[ altura: ," + altura + "Largura : ,"
                + largura + "Área : ," + calcularArea()
                + "Perímetro : ," + calcularPerimetro();
    }
}
