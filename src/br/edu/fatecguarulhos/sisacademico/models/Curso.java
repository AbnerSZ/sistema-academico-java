package br.edu.fatecguarulhos.sisacademico.models;

public class Curso {
	


	int codigo,rgm_aluno,codigo_curso;
	String nome,campus,turno;

	public Curso(int codigo, int rgm_aluno, int codigo_curso, String nome, String campus, String turno) {
		super();
		this.codigo = codigo;
		this.rgm_aluno = rgm_aluno;
		this.codigo_curso = codigo_curso;
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

	public int getRgm_aluno() {
		return rgm_aluno;
	}

	public void setRgm_aluno(int rgm_aluno) {
		this.rgm_aluno = rgm_aluno;
	}

	public int getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(int codigo_curso) {
		this.codigo_curso = codigo_curso;
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
