package Atividade2;

public class Funcionario {

	private String nome;
	private String cargoAtual;
	private double salario;
	private String dataEntrada;
	private String cargoInicial;
	
	
	public Funcionario(String nome, String cargoAtual, double salario, String dataEntrada, String cargoInicial) {
		super();
		this.nome = nome;
		this.cargoAtual = cargoAtual;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.cargoInicial = cargoInicial;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargoAtual() {
		return cargoAtual;
	}


	public void setCargoAtual(String cargoAtual) {
		this.cargoAtual = cargoAtual;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public String getCargoInicial() {
		return cargoInicial;
	}


	public void setCargoInicial(String cargoInicial) {
		this.cargoInicial = cargoInicial;
	}
	
	public void visualizar() {
		System.out.println("Funcionario: "+nome);
		System.out.println("Cargo atual: "+cargoAtual);
		System.out.println("Seu salario atual é: "+salario);
		System.out.println("Entrou na empresa na data: "+dataEntrada);
		System.out.println("Cargo atual: "+cargoInicial);
	}
	
	
	
}
