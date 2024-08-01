package br.ufc.dc.autarquia;

public class Multa {
	private double valor;
	private String gravidade;
	private String nome;
	private int pontos;
	private String descricao;
	
	public Multa(double valor, String gravidade, String nome, int pontos, String descricao) {
		this.valor = valor;
		this.gravidade = gravidade;
		this.nome = nome;
		this.pontos = pontos;
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getGravidade() {
		return gravidade;
	}
	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
