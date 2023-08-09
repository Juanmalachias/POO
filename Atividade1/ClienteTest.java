package Atividade1;

public class ClienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clientes[] lista = new Clientes[5]; 
		int x;
		
		lista[0] = new Clientes("Maria", "123.456.789-00", 30, "Rua A, 123", 1500.0);
		lista[1] = new Clientes("João", "987.654.321-00", 25, "Av. B, 456", 2000.0);
		lista[2] = new Clientes("Ana", "555.555.555-55", 28, "Praça C, 789", 3000.0);
		lista[3] = new Clientes("Pedro", "888.888.888-88", 40, "Avenida D, 987", 2500.0);
		lista[4] = new Clientes("Carla", "999.999.999-99", 22, "Estrada E, 654", 1800.0);
		
		for (Clientes m : lista) {
			m.visualizar();
			System.out.println("=========================================");
			
		}
	}

}
