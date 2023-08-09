package Atividade3;

public class Produto {
	private String nome;
    private String plataforma;
    private double preco;
    private int estoque;
    private boolean lancamento;

    public Produto(String nome, String plataforma, double preco, int estoque, boolean lancamento) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.preco = preco;
        this.estoque = estoque;
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("Lançamento: " + (lancamento ? "Sim" : "Não"));
    }
}

