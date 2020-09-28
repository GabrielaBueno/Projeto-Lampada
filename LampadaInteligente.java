public class LampadaInteligente extends Lampada { //candidato

  private String sensor;
  private String camera;
  private String conexao;
  private String som;

  LampadaInteligente() {

    this.conexao = "";

    this.sensor = "";
    this.camera = "";
  }
//------dados da Lampada usando Super

  public String getConexao() {
    return conexao;
  }
  public void setConexao(String conexao) {
    this.conexao = conexao;
  }

  public int getPreco() {
    return super.getPreco();
  }
  public void setPreco(int  preco) {
    super.setPreco(preco);
  }


  public String getCodigo() {
    return super.getCodigo();
  }
  public void setCodigo(String codigo) {
    super.setCodigo(codigo);
  }


  public String getCor() {
    return super.getCor();
  }
  public void setCor(String cor) {
    super.setCor(cor);
  }


  public String getModelo() {
    return super.getModelo();
  }
  public void setModelo(String modelo) {
    super.setModelo(modelo);
  }


  public String getMarca() {
    return super.getMarca();
  }
  public void setMarca(String marca) {
    super.setMarca(marca);
  }

  public String getSuporte() {
    return super.getSuporte();
  }
  public void setSuporte(String suporte) {
    super.setSuporte(suporte);
  }

  public Origem getOrigem() {
    return super.getOrigem();
  }
  public void setOrigem(Origem origem) {
    super.setOrigem(origem);
  }
//--------------------------------
  public String getSensor() {
    return super.getSensor();
  }
  public void setSensor(String sensor) {
    super.setSensor(sensor);
  }


  public String getCamera() {
    return super.getCamera();
  }
  public void setCamera(String camera) {
    super.setCamera(camera);
  }

  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  /*
  //----------THIS
      public int getPreco(){
        return preco;
      }
      public void setPreco(int  preco){
        this.preco = preco;
      }


          public String getCodigo(){
        return codigo;
      }
      public void setCodigo(String codigo){
        this.codigo = codigo;
      }


      public String getCor(){
        return cor;
      }
      public void setCor(String cor){
        this.cor = cor;
      }


      public String getModelo(){
        return modelo;
      }
      public void setModelo(String modelo){
        this.modelo = modelo;
      }


      public String getMarca(){
        return marca;
      }
      public void setMarca(String marca){
        this.marca = marca;
      }

      public String getSuporte(){
        return suporte;
      }
      public void setSuporte(String suporte){
        this.suporte = suporte;
      }

      public Origem getOrigem(){
        return origem;
      }
      public void setOrigem(Origem origem){
        this.origem = origem;
      }

  //----------dados da lampadaInteligente
      public String getSensor(){
        return sensor;
      }
      public void setSensor(String sensor){
      this.sensor = sensor;
      }

       public String getCamera(){
        return camera;
      }
      public void setCamera(String camera){
      this.camera = camera;
      }
      */
//----------imprimindo
  public void imprime() {
    System.out.println("\n ------- Dados do Cadastro-----");
    System.out.println("\n Cpf.......:" + this.getOrigem().getCadastro().getCpf());
    System.out.println("\n Nome......:" + this.getOrigem().getCadastro().getNome());
    System.out.println("\n Cod Pais..:" + this.getOrigem().getCodPais());
    System.out.println("\n Nome Pais.:" + this.getOrigem().getPais());
    System.out.println("\n -------Dados da Lampada-------");
    System.out.println("\n Preco.....:" + this.getPreco());
    System.out.println("\n Codigo....:" + this.getCodigo());
    System.out.println("\n Cor.......:" + this.getCor());
    System.out.println("\n modelo....:" + this.getModelo());
    System.out.println("\n Marca.....:" + this.getMarca());
    System.out.println("\n Sensor....:" + this.getSensor());
    System.out.println("\n Camera....:" + this.getCamera());
    System.out.println();
  }
}
