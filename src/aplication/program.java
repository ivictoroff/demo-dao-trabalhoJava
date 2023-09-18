package aplication;

import model.dao.ClienteDao;
import model.dao.DaoFactore;
import model.entities.Cliente;

public class program {

	public static void main(String[] args) {
		
		Cliente obj = new Cliente(1, "victor" , "61998451666", "cse 06 lote 80");
		
		ClienteDao clienteDao = DaoFactore.createClienteDao(); // para injetar a depedencia sem expor a implementacao
		Cliente cliente = clienteDao.findById(3);
		
		
		System.out.println(cliente);
	}

}
