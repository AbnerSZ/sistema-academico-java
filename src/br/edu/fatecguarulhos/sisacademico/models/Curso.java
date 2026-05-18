package br.edu.fatecguarulhos.sisacademico.models;

public class Curso {
	

	//Declaração de Atributos
	private int codigo;
	private String nome,campus,turno;
	
	//Inicialização do Construtor
	
	public Curso() {}

	public Curso(int codigo, String nome, String campus, String turno) {
		this.codigo = codigo;
		this.nome = nome;
		this.campus = campus;
		this.turno = turno;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}


}
