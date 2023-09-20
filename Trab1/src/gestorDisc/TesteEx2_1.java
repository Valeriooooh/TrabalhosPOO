package gestorDisc;

public class TesteEx2_1 {
	public static void main(String[] args) {

		Disciplina d1 = new Disciplina("POO", 300, "Programação Orientada para Objetos");
		Disciplina d2 = new Disciplina("FBD", 200, "Fundamentos de Bases de Dados");

		Aluno a1 = new Aluno(12345, "Bernardina Manuela");
		Aluno a2 = new Aluno(12346, "Joaquim Eufrásio");
		Aluno a3 = new Aluno(12347, "Mefistófeles Ferreira");
		Aluno a4 = new Aluno(12347, "Joaquina Eustácia");
		Aluno a5 = new Aluno(12347, "Zé Manel");

		d1.inscreve(a1);
		d1.inscreve(a2);
		d1.inscreve(a3);

		d2.inscreve(a3);
		d2.inscreve(a4);
		d2.inscreve(a5);

		System.out.println(d1);
		System.out.println(d2);

	}

}
