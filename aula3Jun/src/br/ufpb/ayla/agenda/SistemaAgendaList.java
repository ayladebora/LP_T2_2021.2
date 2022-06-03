package br.ufpb.ayla.agenda;

import java.util.LinkedList;
import java.util.List;

public class SistemaAgendaList implements SistemaAgenda {

	private List<Contato> contatos;
	
	public SistemaAgendaList() {
		this(new LinkedList<>());
	}
	
	public SistemaAgendaList(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
	
	@Override
	public boolean cadastrarContato(Contato c) {
		if (this.contatos.contains(c)) {
			return false;
		} else {
			this.contatos.add(c);
			return true;
		}
	}

	@Override
	public String pesquisarTelefoneDeContato(String nome) {
		for (Contato c: this.contatos) {
			if (c.getNome().equals(nome)) {
				return c.getTelefone();
			}
		}
		return  "Telefone não encontrado";
	}

	@Override
	public List<Contato> pesquisarContatosComNomeComecandoCom(String prefixo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean apagarContato(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

}
