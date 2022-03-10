package com.add.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para fazer a conexão com o banco de dados
 * @author Davi Machado
 * @date 09/03/2022
 */
public class Conexao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/desafio_ponto_add?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "12345";
		
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
}
