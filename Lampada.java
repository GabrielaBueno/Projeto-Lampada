
public  abstract class Lampada implements ComputCpf, ComputNome {

	private int preco;
	private String codigo;
	private String cor;
	private String modelo;
	private String marca;
	private String suporte;
	private Origem origem = new Origem();

	Lampada() {
		this.preco = 0;
		this.codigo = "";
		this.cor = "";
		this.modelo = "";
		this.marca = "";
		this.suporte = "";
	}


	public int getPreco() {
		return preco;
	}
	public void setPreco(int  preco) {
		this.preco = preco;
	}

	public String getSensor() {
		return this.codigo;
	}

	public void setSensor(String sensor) {
		this.codigo = sensor;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCamera() {
		return this.marca;
	}

	public void setCamera(String camera) {
		this.marca = camera;
	}


	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSuporte() {
		return suporte;
	}
	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}


	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public void calcString() {
		System.out.println("\n Metodo CalcString() da inteface ComputNome");

	}
	public void calcNumero() {
		System.out.println("\n Metodo CalcNumero() da inteface ComputCpf");
	}

	public abstract void imprime();

}
