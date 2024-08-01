package br.ufc.dc.autarquia.autuacoes;

import java.util.List;

import br.ufc.dc.autarquia.Local;
import br.ufc.dc.autarquia.Multa;
import br.ufc.dc.autarquia.Veiculo;

public class AutuacaoPessoa extends Autuacao{
	private String nome;
	
	public AutuacaoPessoa(List<Multa> multa, Veiculo veiculo, Local local) {
		super(multa, veiculo, local);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
