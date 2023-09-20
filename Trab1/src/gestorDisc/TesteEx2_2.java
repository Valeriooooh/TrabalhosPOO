package gestorDisc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


public class TesteEx2_2 {
	public static void main(String[] args)  {


		File fic = new File("Ficheiro.txt");
		try {
			List<Aluno> al =  Aluno.ler_alunos(fic);
			for(Aluno a: al){
				System.out.println(a.toString());
			}
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
			System.exit(1);
		}
		
		
	}

}
