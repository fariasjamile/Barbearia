package Model;

import java.util.Date;

public class Usuario extends pessoa {
	
	public Usuario(int id, String nome) {
		super(id, nome);
	}
	
	private String nevelAcesso;
	private String senha;
	public Usuario(int id, String nome, String senha, String nevelAcesso) {
		super(id, nome);
		this.senha = senha;	
	}
	

	
}

