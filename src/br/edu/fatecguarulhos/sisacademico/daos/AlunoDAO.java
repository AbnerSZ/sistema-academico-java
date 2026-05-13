package br.edu.fatecguarulhos.sisacademico.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.edu.fatecguarulhos.sisacademico.models.Aluno;
import br.edu.fatecguarulhos.sisacademico.utils.ConnectionFactory;

public class AlunoDAO {
	public Aluno buscarAluno(Integer RGM) throws Exception{
		Aluno aluno = new Aluno();
		String query = "SELECT * FROM aluno WHERE rgm = ?";
		try(PreparedStatement pstmt = ConnectionFactory.getConnection().prepareStatement(query)){
			pstmt.setInt(1, RGM);
			ResultSet rs = pstmt.executeQuery();
			if(rs.first()) {
			
			}
		}
		catch (SQLException e) {
			throw new Exception("Erro no banco de dados");
		}
		return aluno;
	} 
	
	public void inserirAluno(Aluno aluno) {}
	
	public void deletarAluno(Aluno aluno) {
		deletarNotas();
	}
	private void deletarNotas() {}
}
