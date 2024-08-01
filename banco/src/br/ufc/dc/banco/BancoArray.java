package br.ufc.dc.banco;

import java.util.ArrayList;
import java.util.List;

import br.ufc.dc.banco.contas.Conta;
import br.ufc.dc.banco.contas.ContaPoupanca;

public class BancoArray {
	private List<Conta> contas;
	private double taxaJuros = 0.1;
	
	public BancoArray() {
		contas = new ArrayList<Conta>();
	}
	
	public void cadastrar(Conta conta) {
		contas.add(conta);
	}
	
	public Conta procurar(String numero) {
		Conta contaAchada = null;
		
		for(int i=0; i<contas.size(); i++) {
			if(contas.get(i) == null) {
				break;
			}
			
			if(contas.get(i).getNumero().equals(numero)) {
				contaAchada = contas.get(i);
				break;
			}
		}
		
		return contaAchada;
	}
	
	public double saldo(String numero) {
		Conta contaAchada = procurar(numero);
		return contaAchada.getSaldo();
	}
	
	public void creditar(String numero, double valor) {
		Conta contaAchada = procurar(numero);
		if(contaAchada != null) {
			contaAchada.creditar(valor);
		}
	}
	
	public void debitar(String numero, double valor) {
		Conta contaAchada = procurar(numero);
		if(contaAchada != null) {
			contaAchada.debitar(valor);
		}
	}
	
	public void tranferir(String numeroOrigem, String numeroDestino, double valor) {
		Conta contaOrigem = procurar(numeroOrigem);
		Conta contaDestino = procurar(numeroDestino);
		
		if(contaOrigem != null && contaDestino != null) {
			contaOrigem.debitar(valor);
			contaDestino.creditar(valor);
		} else {
			System.out.println("Uma ou mais contas não encontradas!");
		}
	}
	
	public void renderJuros(String numero) {
		Conta contaAchada = procurar(numero);
		
		if(contaAchada instanceof ContaPoupanca) {
			((ContaPoupanca) contaAchada).renderJuros(taxaJuros);
		}
	}
}
