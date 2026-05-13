CREATE DATABASE db_cadastro_alunos;

CREATE TABLE IF NOT EXISTS aluno(
	rgm INTEGER PRIMARY KEY,
	nome VARCHAR(50),
	email VARCHAR(50),
	cpf VARCHAR(10),
	endereco VARCHAR(50),
	município VARCHAR(50),
	uf VARCHAR(2),
	celular VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS curso(
	codigo INTEGER PRIMARY KEY,
	nome VARCHAR(50),
	campus VARCHAR(50),
	turno VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS disciplina(
	codigo INTEGER PRIMARY KEY,
	rgm_aluno INTEGER,
	codigo_curso INTEGER,
	nome VARCHAR(50),
	faltas INTEGER,
	nota FLOAT,
	semestre VARCHAR(10),
	CONSTRAINT fk_aluno FOREIGN KEY(rgm_aluno) REFERENCES aluno(rgm),
	CONSTRAINT fk_curso FOREIGN KEY(codigo_curso) REFERENCES curso(codigo)
);