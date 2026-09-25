public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("José Alencar", "Brasileira");
        Livro livro = new Livro("Iracema", 25.0, autor);
        livro.exibirDetalhes();
    }
}