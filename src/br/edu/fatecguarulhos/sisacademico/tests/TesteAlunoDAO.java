package br.edu.fatecguarulhos.sisacademico.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.fatecguarulhos.sisacademico.daos.AlunoDAO;
import br.edu.fatecguarulhos.sisacademico.models.Aluno;

class TesteAlunoDAO {
	private AlunoDAO dao;
	TesteAlunoDAO(){
		dao = new AlunoDAO();
	}
	@Test
	void testBuscarAluno() {
		assertDoesNotThrow(()->{
			Aluno a = dao.buscarAluno(1);
			System.out.println(a.getNome());
			System.out.println(a.getCpf());
		});
	}
	@Test
	void buscarAlunoNaoCadastrado() {
		assertThrows(Exception.class, ()->{
			dao.buscarAluno(0);
		});
	}

	@Test
	void testInserirAluno() {
		assertDoesNotThrow(()->{
			
				Aluno aluno = new Aluno(2,"Fulano","fulano@email","123", "Rua tal", "Cidadinha", "SP", "1190000");
				assertTrue(dao.inserirAluno(aluno) == 1);
				assertNotNull(dao.buscarAluno(2));
			
			
		});
		
		
	}

	@Test
	void testDeletarAluno() {
		assertDoesNotThrow(()->{
			Aluno aluno = new Aluno(2,"Fulano","fulano@email","123", "Rua tal", "Cidadinha", "SP", "1190000");
			//Se não existir um aluno com este rgm, criar
			if(dao.buscarAluno(aluno) == null) dao.inserirAluno(aluno);
			//deletar
			dao.deletarAluno(aluno);
			//Verificar se realmente foi deletado
			assertThrows(Exception.class,()->{dao.buscarAluno(2);});
			//Inserir aluno de volta
			dao.inserirAluno(aluno);
		});
	}
	@Test
	void testAtualizarAluno() {
		assertDoesNotThrow(()->{
			Aluno aluno = new Aluno(2,"atualizado","fulano@email","123", "Rua tal", "Cidadinha", "SP", "1190000");
			dao.atualizarAluno(aluno);
			assertTrue(dao.buscarAluno(aluno).getNome().equals(aluno.getNome()));
			
		});
	}

}
