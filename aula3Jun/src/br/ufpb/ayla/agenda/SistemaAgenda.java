package br.ufpb.ayla.agenda;

import java.util.List;

public interface SistemaAgenda {
	
	boolean cadastrarContato(Contato c);
	String pesquisarTelefoneDeContato(String nome);
	List<Contato> pesquisarContatosComNomeComecandoCom(String prefixo);
	boolean apagarContato(String nome);

}
