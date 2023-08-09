package Atividade6;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso("Introdução à Programação", "Tecnologia", 199.99, 40, true);
        Curso curso2 = new Curso("Inglês Intermediário", "Idiomas", 149.90, 30, true);

        System.out.println("Informações do Curso 1:");
        curso1.visualizar();

        System.out.println("\nInformações do Curso 2:");
        curso2.visualizar();
	}

}
