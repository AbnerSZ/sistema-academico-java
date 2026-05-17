package br.edu.fatecguarulhos.sisacademico.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import br.edu.fatecguarulhos.sisacademico.models.Aluno;
import br.edu.fatecguarulhos.sisacademico.utils.ConnectionFactory;

public class AlunoDAO {
	public Aluno buscarAluno(Aluno aluno) throws Exception{
		return buscarAluno(aluno.getRgm());
	}
	public Aluno buscarAluno(Integer RGM) throws Exception{
		Aluno aluno = new Aluno();
		String query = "SELECT "
				+ "nome, cpf, email, endereco, municipio, uf, celular "
				+ "FROM aluno WHERE rgm = ?";
		try{
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, RGM);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				aluno.setRgm(RGM);
				aluno.setNome(rs.getString(1));
				aluno.setCpf(rs.getString(2));
				aluno.setEmail(rs.getString(3));
				aluno.setEndereco(rs.getString(4));
				aluno.setMunicipio(rs.getString(5));
				aluno.setUf(rs.getString(6));
				aluno.setCelular(rs.getString(7));
			}
			else aluno = null;
			connection.close();
			if(aluno == null) throw new Exception("Aluno não encontrado");
			return aluno;
		}
		catch (SQLException e) {
			throw e;
		}
	} 
	
	public int inserirAluno(Aluno aluno) throws Exception {
		aluno.validarDados();
		String sql = "INSERT INTO aluno "
				+ "(rgm, nome, email, cpf, endereco, municipio, uf, celular) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		try{
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRgm());
			pstmt.setString(2, aluno.getNome());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setString(4, aluno.getCpf());
			pstmt.setString(5, aluno.getEndereco());
			pstmt.setString(6, aluno.getMunicipio());
			pstmt.setString(7, aluno.getUf());
			pstmt.setString(8, aluno.getCelular());
			int valoresInseridos = pstmt.executeUpdate();
			connection.close();
			return valoresInseridos;
		}
		catch (SQLException e) {
			if(e.getErrorCode() == 1062 && e.getMessage().contains(String.valueOf(aluno.getRgm())))
				throw new Exception("Aluno com este RGM já cadastrado.");
			else throw e;
		}
	}
	
	public void deletarAluno(Aluno aluno) {
		deletarNotas();
		String sql = "DELETE FROM aluno WHERE rgm = ?";
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRgm());
			pstmt.execute();
			connection.close();	
			}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	private void deletarNotas() {}
	public void atualizarAluno(Aluno aluno) {
		aluno.validarDados();
		String sql = "UPDATE aluno SET "
				+ "nome = ?, email = ?, cpf = ?, endereco = ?, municipio = ?, uf = ?, celular = ?"
				+ "WHERE rgm = ?";
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, aluno.getNome());
			pstmt.setString(2, aluno.getEmail());
			pstmt.setString(3, aluno.getCpf());
			pstmt.setString(4, aluno.getEndereco());
			pstmt.setString(5, aluno.getMunicipio());
			pstmt.setString(6, aluno.getUf());
			pstmt.setString(7, aluno.getCelular());
			pstmt.setInt(8, aluno.getRgm());
			pstmt.execute();
			connection.close();
		}
		catch(Exception e) {
			
		}
	}
	private void tratamentoSQLException(SQLException sqle, Aluno aluno) {
		
	}
}
