package br.com.stefanini.maratonadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;



@Entity
@Table(name = "cliente")
public class Cliente extends PanacheEntityBase {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "nome" )
		@Length(min = 3, max = 100)
		public String nome;
	
		@Column(name = "cpf", unique = true)
	    private Long cpf;

	    @Column(name = "endereco")
	    private String endereco;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "contato")
	    private int contato;

		public String getNome() {
			return nome;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Long getCpf() {
			return cpf;
		}

		public void setCpf(Long cpf) {
			this.cpf = cpf;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getContato() {
			return contato;
		}

		public void setContato(int contato) {
			this.contato = contato;
		}
	
	

}
