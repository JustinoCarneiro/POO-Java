package br.ufc.dc.autarquia.autuacoes;

import java.util.List;

import br.ufc.dc.autarquia.Local;
import br.ufc.dc.autarquia.Multa;
import br.ufc.dc.autarquia.Veiculo;

public class AutuacaoMaquina extends Autuacao{
	private String modelo;
	private String tipo;
	
	public AutuacaoMaquina(List<Multa> multas, Veiculo veiculo, Local local) {
		super(multas, veiculo, local);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
