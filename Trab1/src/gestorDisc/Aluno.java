package gestorDisc;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	@Override
	public String toString() {
		return "Aluno [numero=" + numero + ", nome=" + nome + "]";
	}

	private int numero;
	private String nome;

	public static List<Aluno> ler_alunos(File ficheiro) throws FileNotFoundException {
		Scanner scanner = new Scanner(ficheiro);
		List<Aluno> lista = new ArrayList<Aluno>();
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			// separar strings
			String[] al = line.split(" ", 2);
			// dar parse, criar objeto e adicionar à lista num one liner
			lista.add(new Aluno(Integer.parseInt(al[0]), al[1]));
		}
		scanner.close();
		return lista;
	}

	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
