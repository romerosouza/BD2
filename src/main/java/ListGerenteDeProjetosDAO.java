import java.util.ArrayList;
import java.util.List;


public class ListGerenteDeProjetosDAO implements GerenteDeProjetosDAO {

	private List<Projeto> projetos = new ArrayList<Projeto>();

	
	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
		System.out.println("Projeto adicionado");

	}

	public Projeto getProjeto(int id) {
		// TODO Auto-generated method stub
		return projetos.get(id);
	}

	public void removeProjeto(int id) {
		// TODO Auto-generated method stub

	}

	public void atualizaProjeto(int id, Projeto projeto) {
		// TODO Auto-generated method stub

	}

	public List<Projeto> getTodosProjetos() {
		// TODO Auto-generated method stub
		return null;
	}

}
