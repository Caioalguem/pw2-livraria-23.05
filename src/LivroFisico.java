public class LivroFisico extends Livro{ //extends -> herda (no caso de Livro.)

    public LivroFisico(String nome, double preco) {super (nome, preco);}

    public double getTaxaImpressao(){
        return preco * 0.05;           //gracas ao protected, so chamar o "preco"
    }

}
