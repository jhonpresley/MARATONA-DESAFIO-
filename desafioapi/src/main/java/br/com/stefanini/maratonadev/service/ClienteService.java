package br.com.stefanini.maratonadev.service;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import br.com.stefanini.maratonadev.dao.ClienteDao;
import br.com.stefanini.maratonadev.dto.ClienteDto;
import br.com.stefanini.maratonadev.model.Cliente;
import br.com.stefanini.maratonadev.model.parser.ClienteParser;
import java.util.List;



@RequestScoped
public class ClienteService {
    @Inject
    ClienteDao dao;


    public List<Cliente> listar(){
        return dao.listar();
     }
    
    @Transactional(rollbackOn = Exception.class)
	public void inserir(ClienteDto clienteDto) {
		Cliente cliente = ClienteParser.get().cliente(clienteDto);
		dao.inserir(cliente);
	}
	
    
    
    
    
    

    
}
