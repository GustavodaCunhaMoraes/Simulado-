public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double larg, double alt) {
        this.largura = larg;
        this.altura = alt;
    }

    public Retangulo() {
        this(1.0, 1.0);
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public boolean isQuadrado() {
        return altura == largura;
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5.0, 5.0);
        if (ret.isQuadrado() == true) {
            System.out.println("O retangulo e quadrado e tem area: " + ret.calcularArea());
        } else {
            System.out.println("Nao e quadrado");
        }
    }
}