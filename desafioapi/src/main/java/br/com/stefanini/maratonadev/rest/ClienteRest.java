package br.com.stefanini.maratonadev.rest;

import br.com.stefanini.maratonadev.dto.ClienteDto;
import br.com.stefanini.maratonadev.model.Cliente;
import br.com.stefanini.maratonadev.service.ClienteService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("cliente")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)


public class ClienteRest {

    @Inject
    ClienteService service;

    @GET
    @Operation(summary = "Listar Cliente",description = "Lista de todos os cliente")
    @APIResponse(responseCode = "201",description = "cliente",content = {
                    @Content(mediaType =  "application/json",schema = @Schema(implementation = ClienteDto.class))
            }
    )
    
    
    public List<Cliente> listar(){
    	return Cliente.listAll();
    	
    }

    
	@POST
    @Transactional(rollbackOn = Exception.class)
	@Operation(summary = "Incluir um cliente",
	description = "Incluir CLIENTE")
	@APIResponse(responseCode = "201",
	description = "INCLUSAO",
	content = {
			@Content(mediaType =  "application/json",
			schema = @Schema(implementation = ClienteDto.class))
			}
	)
	public void incluir(ClienteDto clienteDto) {
		Cliente cliente = new Cliente();
		
		
		  cliente.setNome(clienteDto.getNome()); cliente.setCpf(clienteDto.getCpf());
		  cliente.setEndereco(clienteDto.getEndereco());
		  cliente.setEmail(clienteDto.getEmail());
		  cliente.setContato(clienteDto.getContato());
		 
		
		cliente.persist();

}
	
}
