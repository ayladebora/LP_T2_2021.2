package br.ufpb.dcx.gerentecolecoes;

public class ItemColecionavel {

    private String nome;
    private String dataDeIngressoNaColecao;
    private String descricao;
    private String tipo;

    public static final String TIPO_BONECAS = "Bonecas";
    public static final String TIPO_CARTAS_POKEMON = "Cartas Pokemon";
    public static final String TIPO_CARRINHOS_HOTWHEELS = "Carrinhos HotWheels";
    public static final String TIPO_JOGOS_DE_TABULEIRO = "Jogos de Tabuleiro";

    public ItemColecionavel(String nome, String dataDeIngressoNaColecao, String descricao, String tipo) {
        this.nome = nome;
        this.dataDeIngressoNaColecao = dataDeIngressoNaColecao;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public ItemColecionavel() {
        this("", "29/04/2022", "", "INDEFINIDO");
    }

    public String toString() {
        return "Item colecionável de nome " + this.nome + ", descrição:" + this.descricao
                + ", que entrou na coleção na data " + this.dataDeIngressoNaColecao + " e que é do tipo " +
                this.tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeIngressoNaColecao() {
        return this.dataDeIngressoNaColecao;
    }

    public void setDataDeIngressoNaColecao(String novaData) {
        this.dataDeIngressoNaColecao = novaData;
    }

}