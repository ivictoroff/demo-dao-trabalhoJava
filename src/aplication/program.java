package aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.ClienteDao;
import model.dao.DaoFactore;
import model.entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		ClienteDao clienteDao = DaoFactore.createClienteDao(); // para injetar a depedencia sem expor a implementacao
		
		System.out.println("insira o id q deseja buscar");
		Cliente cliente = clienteDao.findById(sc.nextInt());
		
		
		System.out.println(cliente);
		
		System.out.println("--------teste 2 ----------");
		
		List<Cliente> list = clienteDao.findAll();
			
			for (Cliente obj : list) {
				System.out.println(obj);
			}
			
		
		sc.close();
	}

}
