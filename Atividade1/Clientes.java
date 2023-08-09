package Atividade1;

public class Clientes {
	
	private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private double saldo;
    
    
	public Clientes(String nome, String cpf, int idade, String endereco, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.saldo = saldo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    public void visualizar() {
    	System.out.println("Cliente:"+nome);
    	System.out.println("CPF:"+cpf);
    	System.out.println("Idade:"+idade);
    	System.out.println("Endereço:"+endereco);
    	System.out.println("Saldo de conta:"+saldo);
    }
    
}
