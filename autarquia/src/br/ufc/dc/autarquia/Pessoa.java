package br.ufc.dc.autarquia;

public class Pessoa {
	private String nome;
	private String cpf;
	private String cnh;
	private String tipo_cnh;
	
	public Pessoa(String nome, String cpf, String cnh, String tipo_cnh) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.tipo_cnh = tipo_cnh;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public String getTipo_cnh() {
		return tipo_cnh;
	}
	public void setTipo_cnh(String tipo_cnh) {
		this.tipo_cnh = tipo_cnh;
	}
}
