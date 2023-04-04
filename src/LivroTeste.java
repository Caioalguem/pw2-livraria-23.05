public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro( "O Hobbit",8.99);
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora("Editora Erica");
        //editora1.nome ="Editora Erica";
        editora1.email = "edErica@gmail.com";
        meuLivro.editora = editora1;

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro( "O Código Da Vinci",8.99);
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
