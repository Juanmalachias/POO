package Atividade2;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario Funcionario1 = new Funcionario("Ana Silva", "Diretora de Operações", 15000, "01/02/2015", "Gerente de Projetos");
		Funcionario Funcionario2 = new Funcionario("Eduardo Santos", "Vice-Presidente de Marketing", 18500, "15/09/2012", "Analista de Marketing");
		Funcionario Funcionario3 = new Funcionario("Mariana Oliveira", "Diretora Financeira", 14800, "10/07/2014", "Assistente Financeiro");
		Funcionario Funcionario4 = new Funcionario("Rafael Almeida", "Chefe de Desenvolvimento de Software", 16200, "05/04/2013", "Estagiário de Desenvolvimento");
		Funcionario Funcionario5 = new Funcionario("Isabela Costa", "Gerente de Recursos Humanos", 13700, "20/11/2016", "Assistente de RH");
		
		System.out.println("Informações dos Funcionario 1:");
		Funcionario1.visualizar();
		System.out.println("============================================");
        System.out.println("\nInformações do Funcionario 2:");
        Funcionario2.visualizar();
        System.out.println("============================================");        
        System.out.println("\nInformações do Funcionario 3:");
        Funcionario3.visualizar();
        System.out.println("============================================");        
        System.out.println("\nInformações do Funcionario 4:");
        Funcionario4.visualizar();
        System.out.println("============================================");        
        System.out.println("\nInformações do Funcionario 5:");
        Funcionario5.visualizar();
	}

}
