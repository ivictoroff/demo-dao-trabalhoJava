package model.dao;

import java.util.List;

import model.entities.Cliente;

public interface ClienteDao {

	 void insert (Cliente obj); //insere novos dados ao banco de dados
	 void update (Cliente obj); // atualiza dados existentes no banco de dados
	 void deleteById (Integer id); // deleta o dado pelo id
	 Cliente findById (Integer id); // busca pleo id
	 List<Cliente> findAll(); //busca todos 
}
