public class Armazenamento {
	private LampadaInteligente vetLampadaInteligente[] = new LampadaInteligente [5];
	private LampadaMusical vetLampadaMusical[] = new LampadaMusical [5];

	private int nLampadaInteligente;
	private int nLampadaMusical;

	Armazenamento () {
		nLampadaInteligente = 0;
		nLampadaMusical = 0;
	}

	public void insereLampadaInteligente (LampadaInteligente lampadaInteligente) {
		vetLampadaInteligente[nLampadaInteligente] = lampadaInteligente;
		this.nLampadaInteligente++;
	}

	public void insereLampadaMusical (LampadaMusical lampMusic) {
		vetLampadaMusical[nLampadaMusical] = lampMusic;
		this.nLampadaMusical++;
	}

	public void buscaLampadaInteligente (int n) {
		if (verificaLampadaInteligente(n) >= 0) {
			System.out.println("LampadaInteligente  cadastrado...");
			return;
		}
		System.out.println("LampadaInteligente nao cadastrado");
	}

	public void buscaLampadaMusical (int n) {


		if (verificaLampadaMusical(n) >= 0) {
			System.out.println("LampadaMusical cadastrado...");
			return;
		}
		System.out.println("LampadaMusical nao cadastrado");


	}

	//----altera e excluir (Falta Fazer)

	public void imprimeLampadaInteligente() {
		for (int i = 0; i < nLampadaInteligente; i++) {

			System.out.println("\n Cpf......:" + vetLampadaInteligente[i].getOrigem().getCadastro().getCpf());
			System.out.println("\n Nome.....:" + vetLampadaInteligente[i].getOrigem().getCadastro().getNome());
			System.out.println("\n Cod Pais..:" + vetLampadaInteligente[i].getOrigem().getCodPais());
			System.out.println("\n Nome Pais.:" + vetLampadaInteligente[i].getOrigem().getPais());
			System.out.println("\n Preco.....:" + vetLampadaInteligente[i].getPreco());
			System.out.println("\n Codigo....:" + vetLampadaInteligente[i].getCodigo());
			System.out.println("\n Cor.......:" + vetLampadaInteligente[i].getCor());
			System.out.println("\n modelo....:" + vetLampadaInteligente[i].getModelo());
			System.out.println("\n Marca.....:" + vetLampadaInteligente[i].getMarca());
			System.out.println("\n Sensor....:" + vetLampadaInteligente[i].getSensor());
			System.out.println("\n Camera....:" + vetLampadaInteligente[i].getCamera());
		}
	}

	public void imprimeLampadaMusical() {
		for (int i = 0; i < nLampadaMusical; i++) {

			System.out.println("\n Cpf......:" + vetLampadaMusical[i].getOrigem().getCadastro().getCpf());
			System.out.println("\n Nome.....:" + vetLampadaMusical[i].getOrigem().getCadastro().getNome());
			System.out.println("\n Cod Pais..:" + vetLampadaMusical[i].getOrigem().getCodPais());
			System.out.println("\n Nome Pais.:" + vetLampadaMusical[i].getOrigem().getPais());
			System.out.println("\n Preco.....:" + vetLampadaMusical[i].getPreco());
			System.out.println("\n Codigo....:" + vetLampadaMusical[i].getCodigo());
			System.out.println("\n Cor.......:" + vetLampadaMusical[i].getCor());
			System.out.println("\n modelo....:" + vetLampadaMusical[i].getModelo());
			System.out.println("\n Marca.....:" + vetLampadaMusical[i].getMarca());
			System.out.println("\n Conexao...:" + vetLampadaMusical[i].getConexao());
			System.out.println("\n Som.......:" + vetLampadaMusical[i].getSom());
		}
	}

	private int verificaLampadaInteligente (int n) {
		for (int i = 0; i < nLampadaInteligente; i++) {
			if (n == vetLampadaInteligente[i].getOrigem().getCadastro().getCpf()) {
				return i;
			}
		}
		return -1;
	}


	private int verificaLampadaMusical (int n) {

		for (int i = 0; i < nLampadaMusical; i++) {
			if (n == vetLampadaMusical[i].getPreco()) {
				return i;
			}
		}
		return -1;
	}

}