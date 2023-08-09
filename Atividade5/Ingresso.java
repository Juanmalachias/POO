package Atividade5;

public class Ingresso {

	private String nomeEvento;
    private String local;
    private double preco;
    private String data;
    private int quantidadeDisponivel;

    public Ingresso(String nomeEvento, String local, double preco, String data, int quantidadeDisponivel) {
        this.nomeEvento = nomeEvento;
        this.local = local;
        this.preco = preco;
        this.data = data;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void visualizar() {
        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Local: " + local);
        System.out.println("Preço: R$" + preco);
        System.out.println("Data: " + data);
        System.out.println("Quantidade Disponível: " + quantidadeDisponivel + " ingressos");
    }
}