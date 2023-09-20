package gestorDisc;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String sigla;
	private int n_vagas;
	private String nome;
	private List<Inscricao> inscricoes = new ArrayList<>();

	public Disciplina(String sigla, int n_vagas, String nome) {
		this.sigla = sigla;
		this.n_vagas = n_vagas;
		this.nome = nome;
	}

	public void inscreve(Aluno a1) {
		inscricoes.add(new Inscricao(a1));

	}

	@Override
	public String toString() {
		String newline = System.lineSeparator();
		String resultado = "Disciplina [sigla=" + sigla + ", n_vagas=" + n_vagas + ", nome=" + nome + ", " + newline + " inscricoes=";
		for(Inscricao i: inscricoes) {
			resultado += i + newline;
		}
		return resultado;
	}


}
