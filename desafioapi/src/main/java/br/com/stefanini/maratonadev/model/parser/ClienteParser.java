package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.ClienteDto;
import br.com.stefanini.maratonadev.model.Cliente;

public class ClienteParser {

    public static ClienteParser get(){
        return  new ClienteParser();
    }

    public ClienteDto dto(Cliente entidade){
        ClienteDto dto = new ClienteDto();
        
        dto.setNome(entidade.getNome());
        dto.setCpf(entidade.getCpf());
        dto.setEndereco(entidade.getEndereco());
        dto.setEmail(entidade.getEmail());
        dto.setContato(entidade.getContato());
        
        return dto;
        
    
    }

	public Cliente cliente(ClienteDto clienteDto) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteDto.getNome());
		cliente.setCpf(clienteDto.getCpf());
		cliente.setEndereco(clienteDto.getEndereco());
		cliente.setEmail(clienteDto.getEmail());
		cliente.setContato(clienteDto.getContato());
		
		// TODO Auto-generated method stub
		return cliente;
	}
}
