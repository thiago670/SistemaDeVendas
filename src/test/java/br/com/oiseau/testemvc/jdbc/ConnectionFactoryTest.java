package br.com.oiseau.testemvc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class ConnectionFactoryTest {

	@Test
	public void deveCriarConexao() throws SQLException {
		Connection	connection	=	new	ConnectionFactory().getConnection();
		System.out.println("Conexão	aberta!");
		connection.close();
	}
	
}
