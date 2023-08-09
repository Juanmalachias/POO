package Atividade5;

public class TestaIngresso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ingresso ingresso1 = new Ingresso("Concerto de Rock", "Arena Live", 50.00, "20/08/2023", 100);
        Ingresso ingresso2 = new Ingresso("Peça de Teatro", "Teatro Municipal", 30.00, "15/09/2023", 150);

        System.out.println("Informações do Ingresso 1:");
        ingresso1.visualizar();

        System.out.println("\nInformações do Ingresso 2:");
        ingresso2.visualizar();
	}

}
