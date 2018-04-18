package br.com.oiseau.testemvc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.oiseau.testemvc.jdbc.ConnectionFactory;
import br.com.oiseau.testemvc.modelo.Item;

public class ItemDao {
	private Connection connection;

	public ItemDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Item item) {
		try {
			String sql = "insert into itens (nome, descricao, precoUnitario, tipo) values (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, item.getNome());
			stmt.setString(2, item.getDescricao());
			stmt.setBigDecimal(3, item.getPrecoUnitario());
			stmt.setString(4, item.getTipo());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Item> getLista() {
		try {
			List<Item> itens = new ArrayList<Item>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from itens");

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				Item item = new Item();
				//popula o objeto contato
				item.setNome(rs.getString("nome"));
				item.setDescricao(rs.getString("descricao"));
				item.setPrecoUnitario(rs.getBigDecimal("precoUnitario"));
				item.setTipo(rs.getString("tipo"));

				//adiciona o contato na lista
				itens.add(item);
			}

			rs.close();
			stmt.close();

			return itens;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void exclui(Item item) {
		String sql = "delete from itens where id=?";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, item.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void atualiza(Item item) {
		String sql = "update itens set nome = ?, descricao = ?, precoUnitario = ?, tipo = ? where id = ?";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, item.getNome());
			stmt.setString(2, item.getDescricao());
			stmt.setBigDecimal(3, item.getPrecoUnitario());
			stmt.setString(4, item.getTipo());
			stmt.setLong(5, item.getId());

			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
