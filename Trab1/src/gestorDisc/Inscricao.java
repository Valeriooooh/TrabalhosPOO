package gestorDisc;

public class Inscricao {

	private static final int NAO_AVALIADO = -1;
	private Aluno aluno;
	private int nota;

	public Inscricao(Aluno aluno) {
		this.aluno = aluno;
		this.nota = NAO_AVALIADO;
	}

	@Override
	public String toString() {
		return "Inscricao [aluno=" + aluno + ", nota=" + (nota == -1 ? "NA" : nota) + "]";
	}

}
