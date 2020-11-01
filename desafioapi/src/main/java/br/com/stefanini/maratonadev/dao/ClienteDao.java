package br.com.stefanini.maratonadev.dao;



import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import br.com.stefanini.maratonadev.model.Cliente;

@RequestScoped
public class ClienteDao {
	
	
	
	public List<Cliente> listar() {
		return Cliente.listAll();
		
	}

	@Transactional
	public void inserir(Cliente cliente) {

		Cliente.persist(cliente);
	}
	
	
	

}