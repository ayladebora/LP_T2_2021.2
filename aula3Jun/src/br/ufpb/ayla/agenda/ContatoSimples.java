package br.ufpb.ayla.agenda;

public class ContatoSimples extends Contato {

	
	public ContatoSimples(String nome, String telefone, String email) {
		super(nome, telefone, email);
	}
	
	public ContatoSimples() {
		super();
	}
	
	
	@Override
	public String getDadosDeContato() {
		return "Dados: \nNome:"+super.getNome()+"\nTelefone:"+super.getTelefone()+"\nE-mail:"+super.getEmail();
	}
	
	

}
