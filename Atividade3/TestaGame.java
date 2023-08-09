package Atividade3;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1 = new Produto("The Witcher 3: Wild Hunt", "PS4", 79.90, 10, false);
        Produto produto2 = new Produto("FIFA 22", "Xbox One", 129.99, 5, true);
        Produto produto3 = new Produto("Cyberpunk 2077", "PC", 199.99, 3, true);
        Produto produto4 = new Produto("Call of Duty: Warzone", "PS5", 59.90, 20, false);
        Produto produto5 = new Produto("Animal Crossing: New Horizons", "Nintendo Switch", 149.90, 8, true);

        System.out.println("Informações do Produto 1:");
        produto1.visualizar();

        System.out.println("\nInformações do Produto 2:");
        produto2.visualizar();

        System.out.println("\nInformações do Produto 3:");
        produto3.visualizar();

        System.out.println("\nInformações do Produto 4:");
        produto4.visualizar();

        System.out.println("\nInformações do Produto 5:");
        produto5.visualizar();
    }
}
