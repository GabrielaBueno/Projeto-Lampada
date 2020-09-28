public class Origem {

	private int codPais;
	private String pais;
	private Cadastro cadastro;


	Origem() {
		this.codPais = 0;
		this.pais = "";
		this.cadastro = new Cadastro();
	}

	public int getCodPais() {
		return codPais;
	}

	public void setCodPais(int codPais) {
		this.codPais = codPais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}







}