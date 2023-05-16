public class RegistroVendas {
    private double total;

    public void adicionar(Livro Livro){
        System.out.println("Livro adicionado: " + Livro.getNome());
        Livro.aplicarDesconto(0.10);
        total = total + Livro.getPreco();
    }
}
