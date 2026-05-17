package br.edu.fatecguarulhos.sisacademico.models;

public class Disciplina {
	
	//Declaração de Atributos
	private Aluno aluno;
	private Curso curso;
	private int codigo,faltas;
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	private String nome,semestre;
	private float nota;
	
	//Inicialização do Construtor
	public Disciplina(int codigo, int rgm_aluno, int codigo_curso, int faltas, String nome, String semestre, float nota) {
		this.codigo = codigo;
		this.faltas = faltas;
		this.nome = nome;
		this.semestre = semestre;
		this.nota = nota;
	}
	
	//Construtor vazio para evitar erros na inicialização dos objetos
	public Disciplina() {
	}
	
	//Métodos Acessores e Modifcadores (Getters e Setters)
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
}
