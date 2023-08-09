package Atividade4;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacia[] produtos = new Farmacia[5];

        produtos[0] = new Farmacia("Paracetamol", "Medicamento", 10.50, 50, false);
        produtos[1] = new Farmacia("Creme Hidratante", "Cosmético", 25.00, 30, true);
        produtos[2] = new Farmacia("Vitamina C", "Suplemento", 35.00, 20, true);
        produtos[3] = new Farmacia("Antisséptico Bucal", "Higiene", 8.75, 40, false);
        produtos[4] = new Farmacia("Protetor Solar", "Protetor Solar", 19.90, 25, true);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informações do Produto " + (i + 1) + ":");
            produtos[i].visualizar();
            System.out.println("*******************************");
        }
    }
}




