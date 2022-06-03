package br.ufpb.ayla.agenda;

import javax.swing.JOptionPane;

public class ProgramaAgenda {

	public static void main(String[] args) {
		
		SistemaAgenda sistema = new SistemaAgendaList();
		
		boolean  continuar = true;
		while(continuar) {
			String opcao = JOptionPane.showInputDialog("Digite uma opção:\n1.Cadastrar contato\n2.Pesquisar telefone do contato\n3.Listar contatos por inicial\n4.Apagar contato\n5.Sair");
			if (opcao.equals("1")) {
				//CADASTRAR CONTATO
				String tipoContato = JOptionPane.showInputDialog("É um contato simples (1) ou com redes sociais(2)");
				Contato contatoACadastrar = null;
				
				String nome = JOptionPane.showInputDialog("Digite o nome do contato");
				String telefone = JOptionPane.showInputDialog("Digite o telefone do contato");
				String email = JOptionPane.showInputDialog("Digite o email do contato");
				
				
				if (tipoContato.equals("1")) {
					contatoACadastrar = new ContatoSimples(nome,telefone,email);
				} else if (tipoContato.equals("2")) {
					String linkedIn = JOptionPane.showInputDialog("Digite o linkedIn do contato");
					String facebook = JOptionPane.showInputDialog("Digite o facebook do contato");
					String instagram = JOptionPane.showInputDialog("Digite o instagram do contato");
					
					contatoACadastrar = new ContatoComRedesSociais(nome, telefone, email, linkedIn, facebook, instagram);
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente");
					continue;
				}
				boolean cadastrou = sistema.cadastrarContato(contatoACadastrar);
				if (cadastrou) {
					JOptionPane.showMessageDialog(null, "Contato cadastrado com sucesso");
				}
				
						
			} else if (opcao.equals("2")) {
				String nomeAPesquisar = JOptionPane.showInputDialog("Qual o nome do contato cujo telefone você quer?");
				String telefone = sistema.pesquisarTelefoneDeContato(nomeAPesquisar);
				JOptionPane.showMessageDialog(null, "O telefone do contato é "+telefone);
			} else if (opcao.equals("5")) {
				continuar = false;
				JOptionPane.showMessageDialog(null, "Até mais");
			}
		}

	}

}
