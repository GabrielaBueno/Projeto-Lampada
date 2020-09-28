public class TstObjLampada {

	public static void main(String[] args) {

		LampadaInteligente lampadaInteligente = new LampadaInteligente();
		LampadaInteligente lampadaInteligente1 = new LampadaInteligente();
		Leitura l = new Leitura();
		Armazenamento armaz = new Armazenamento();


		lampadaInteligente.getOrigem().getCadastro().setCpf(Integer.parseInt(l.inDados("\n informe o Cpf:")));
		lampadaInteligente.getOrigem().getCadastro().setNome(l.inDados("\n informe o nome:"));
		lampadaInteligente.getOrigem().setCodPais(Integer.parseInt(l.inDados("\n informe o Cod do Pais:")));
		lampadaInteligente.getOrigem().setPais(l.inDados("\n informe o nome do Pais:"));
		lampadaInteligente.setPreco(Integer.parseInt(l.inDados("\n informe o Preco:")));
		lampadaInteligente.setCodigo(l.inDados("\n informe o Codigo:"));
		lampadaInteligente.setCor(l.inDados("\n informe o Cor:"));
		lampadaInteligente.setModelo(l.inDados("\n informe o Modelo:"));
		lampadaInteligente.setMarca(l.inDados("\n informe o Marca:"));
		lampadaInteligente.setSuporte(l.inDados("\n informe o Suporte:"));
		lampadaInteligente.setSensor(l.inDados("\n informe o Sensor:"));
		lampadaInteligente.setCamera(l.inDados("\n informe a Camera:"));


		armaz.insereLampadaInteligente(lampadaInteligente);

		lampadaInteligente1.getOrigem().getCadastro().setCpf(Integer.parseInt(l.inDados("\n informe o Cpf:")));
		lampadaInteligente1.getOrigem().getCadastro().setNome(l.inDados("\n informe o nome:"));
		lampadaInteligente1.getOrigem().setCodPais(Integer.parseInt(l.inDados("\n informe o Cod do Pais:")));
		lampadaInteligente1.getOrigem().setPais(l.inDados("\n informe o nome do Pais:"));
		lampadaInteligente1.setPreco(Integer.parseInt(l.inDados("\n informe o Preco:")));
		lampadaInteligente1.setCodigo(l.inDados("\n informe o Codigo:"));
		lampadaInteligente1.setCor(l.inDados("\n informe o Cor:"));
		lampadaInteligente1.setModelo(l.inDados("\n informe o Modelo:"));
		lampadaInteligente1.setMarca(l.inDados("\n informe o Marca:"));
		lampadaInteligente1.setSuporte(l.inDados("\n informe o Suporte:"));
		lampadaInteligente1.setConexao(l.inDados("\n informe a Conexao:"));
		lampadaInteligente1.setSom(l.inDados("\n informe o Som:"));

		armaz.insereLampadaInteligente(lampadaInteligente1);

		armaz.buscaLampadaInteligente(Integer.parseInt(l.inDados("Digite a indentificacao da Lapada  Pesquisar: ")));
		armaz.buscaLampadaInteligente(Integer.parseInt(l.inDados("Digite a indentificacao da Lapada  Pesquisar: ")));
		armaz.buscaLampadaInteligente(Integer.parseInt(l.inDados("Digite a indentificacao da Lapada  Pesquisar: ")));

		lampadaInteligente1.calcString();
		lampadaInteligente1.calcNumero();



	}
}
