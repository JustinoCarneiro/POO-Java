package br.ufc.dc.autarquia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.ufc.dc.autarquia.autuacoes.Autuacao;
import br.ufc.dc.autarquia.autuacoes.AutuacaoMaquina;
import br.ufc.dc.autarquia.autuacoes.AutuacaoPessoa;

public class Autuador {
	List<Autuacao> autuacoes = new ArrayList<Autuacao>();
	
	public void autuar(List<Multa> multas, Veiculo veiculo, Local local, String tipo) {
		if(tipo == "maquina") {
			AutuacaoMaquina autuacao = new AutuacaoMaquina(multas, veiculo, local);
			autuacoes.add(autuacao);
		} else if (tipo == "pessoa") {
			AutuacaoPessoa autuacao = new AutuacaoPessoa(multas, veiculo, local);
			autuacoes.add(autuacao);
		}
	}
	
	public List<Autuacao> getAtuacao(Local local) {
		List<Autuacao> autuacoesEncontradas = autuacoes.stream().filter(autuacao -> autuacao.getLocal().equals(local)).collect(Collectors.toList());
		
		return autuacoesEncontradas;
	}
	
	public List<Autuacao> getAtuacao(Veiculo veiculo) {
		List<Autuacao> autuacoesEncontradas = autuacoes.stream().filter(autuacao -> autuacao.getVeiculo().equals(veiculo)).collect(Collectors.toList());
		
		return autuacoesEncontradas;
	}
	
	public List<Autuacao> getAtuacao(Pessoa pessoa) {
		List<Autuacao> autuacoesEncontradas = autuacoes.stream().filter(autuacao -> autuacao.getVeiculo().getProprietario().equals(pessoa)).collect(Collectors.toList());
		
		return autuacoesEncontradas;
	}
}
