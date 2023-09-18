package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ClienteDao;
import model.entities.Cliente;

public class ClienteDaoJDBC implements ClienteDao {

	private Connection conn;
	
	public ClienteDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Cliente obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente findById(Integer id) {
		 PreparedStatement st = null;
		 ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT cliente.* " // vai buscar tudo da tabela cliente 
					+ "FROM cliente " 
					+ "WHERE cliente.id = ? "); // e vai buscar de um certo id 
					
			st.setInt(1, id); // vai substituir o id q esta na interrogacao 
			rs /* o resultset/rs recebe o resultado */ = st.executeQuery(); //execute query faz uma busca com oq esta dentro das strings acima
			if (rs.next()) {
				
				Cliente obj = new Cliente();
				obj.setId(rs.getInt("id"));
				obj.setnome(rs.getString("nome"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setEndereco(rs.getString("endereco"));
				return obj;
				
				/*Department dep = new Department();
				*dep.setid(rs.getInt("DepartmentId"));
				*dep.setName(rs.getString("DepName"));*/
			}
			return null;
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
