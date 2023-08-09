package Atividade6;

public class Curso {
	 private String nome;
	 private String area;
	 private double preco;
	 private int duracaoHoras;
	 private boolean certificado;

	    public Curso(String nome, String area, double preco, int duracaoHoras, boolean certificado) {
	        this.nome = nome;
	        this.area = area;
	        this.preco = preco;
	        this.duracaoHoras = duracaoHoras;
	        this.certificado = certificado;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getArea() {
	        return area;
	    }

	    public void setArea(String area) {
	        this.area = area;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getDuracaoHoras() {
	        return duracaoHoras;
	    }

	    public void setDuracaoHoras(int duracaoHoras) {
	        this.duracaoHoras = duracaoHoras;
	    }

	    public boolean isCertificado() {
	        return certificado;
	    }

	    public void setCertificado(boolean certificado) {
	        this.certificado = certificado;
	    }

	    public void visualizar() {
	        System.out.println("Nome do Curso: " + nome);
	        System.out.println("Área: " + area);
	        System.out.println("Preço: R$" + preco);
	        System.out.println("Duração: " + duracaoHoras + " horas");
	        System.out.println("Certificado: " + (certificado ? "Sim" : "Não"));
	    }
	
}
