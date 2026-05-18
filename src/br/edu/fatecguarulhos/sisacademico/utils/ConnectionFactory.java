package br.edu.fatecguarulhos.sisacademico.utils;

import java.sql.*;

public class ConnectionFactory {
	
	public static Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/db_cadastro_alunos";
			String login = "root";
			String senha = "";
			//String login = "debian-sys-maint";
			//String senha = "H8btBt0f9qadIqqb";
			return DriverManager.getConnection(url, login, senha);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	private static void close(Connection conn) throws Exception {
		try {
			conn.close();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
