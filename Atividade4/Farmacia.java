package Atividade4;

public class Farmacia {
	private String nomeProduto;
    private String categoria;
    private double preco;
    private int estoque;
    private boolean promocao;

    public Farmacia(String nomeProduto, String categoria, double preco, int estoque, boolean promocao) {
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.preco = preco;
        this.estoque = estoque;
        this.promocao = promocao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public void visualizar() {
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Categoria: " + categoria);
        System.out.println("preco R$"+preco);
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("Promoção: " + (promocao ? "Sim" : "Não"));
    }
}
