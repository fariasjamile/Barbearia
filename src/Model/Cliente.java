 package Model;

import java.util.Date;

public class Cliente extends pessoa {
	
	
	private String endereco;
	private String cep;
	
	public Cliente(int id, String nome, char sexo, Model.Date dataNascimento, String telefone, String email,
			String rg) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		
		this.endereco = endereco;
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	    

	
}
