public class Livro {
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo + " || Nome do autor: " + autor.getNome() + " || Preco: " + preco);
    }
}
