package br.edu.fatecguarulhos.sisacademico.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.fatecguarulhos.sisacademico.models.Curso;
import br.edu.fatecguarulhos.sisacademico.utils.ConnectionFactory;

public class CursoDAO {

	public Curso buscarCurso(Curso curso) throws Exception {
		return buscarCurso(curso.getCodigo());
	}

	public Curso buscarCurso(Integer codigo) throws Exception {

		Curso curso = new Curso();

		String query = "SELECT nome, campus, turno FROM curso WHERE codigo = ?";

		try {

			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt = connection.prepareStatement(query);

			pstmt.setInt(1, codigo);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				curso.setCodigo(codigo);
				curso.setNome(rs.getString(1));
				curso.setCampus(rs.getString(2));
				curso.setTurno(rs.getString(3));

			} else {
				curso = null;
			}

			connection.close();

			return curso;

		} catch (SQLException e) {

			throw e;

		}
	}

	public int inserirCurso(Curso curso) throws Exception {

		String sql = "INSERT INTO curso "
				+ "(codigo, nome, campus, turno) "
				+ "VALUES (?,?,?,?)";

		try {

			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setInt(1, curso.getCodigo());
			pstmt.setString(2, curso.getNome());
			pstmt.setString(3, curso.getCampus());
			pstmt.setString(4, curso.getTurno());

			int valoresInseridos = pstmt.executeUpdate();

			connection.close();

			return valoresInseridos;

		} catch (SQLException e) {

			throw e;

		}
	}

	public void deletarCurso(Curso curso) {

		String sql = "DELETE FROM curso WHERE codigo = ?";

		try {

			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setInt(1, curso.getCodigo());

			pstmt.execute();

			connection.close();

		} catch (Exception e) {

		}
	}

	public void atualizarCurso(Curso curso) {

		String sql = "UPDATE curso SET "
				+ "nome = ?, campus = ?, turno = ? "
				+ "WHERE codigo = ?";

		try {

			Connection connection = ConnectionFactory.getConnection();

			PreparedStatement pstmt = connection.prepareStatement(sql);

			pstmt.setString(1, curso.getNome());
			pstmt.setString(2, curso.getCampus());
			pstmt.setString(3, curso.getTurno());
			pstmt.setInt(4, curso.getCodigo());

			pstmt.execute();

			connection.close();

		} catch (Exception e) {

		}
	}

}
