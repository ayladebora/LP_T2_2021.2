package br.ufpb.dcx.ayla.agenda;

public class AgendaEnderecos {

    private Contato [] contatos;
    private int maxContatos;
    private int contContatos;

    public AgendaEnderecos(int maxContatos){
        this.maxContatos = maxContatos;
        this.contContatos = 0;
        this.contatos = new Contato[maxContatos];
    }

    public boolean cadastraContato(Contato c){
        if (contContatos< maxContatos){
            this.contatos[contContatos] = c;
            contContatos++;
            return true;
        } else {
            return false;
        }
    }

    public Endereco pesquisaEndereco(String nomeContato){
        for (int k=0; k< this.contContatos; k++){
            if (this.contatos[k].getNome().equals(nomeContato)){
                return this.contatos[k].getEndereco();
            }
        }
        return null; //TODO: TRATAR MELHOR DEPOIS
    }

    public int pesquisarQuantidadeDeContatosDoBairro(String bairro){
        int cont = 0;
        for (int k=0; k< this.contContatos; k++){
            Contato c = this.contatos[k];
            if (c.getEndereco().getBairro().equals(bairro)){
                cont++;
            }
        }
        return cont;
    }









}
