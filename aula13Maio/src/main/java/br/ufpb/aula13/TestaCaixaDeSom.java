package br.ufpb.aula13;

public class TestaCaixaDeSom {

    public static void main(String [] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Cachorro("Ayla"));

        caixa.adicionarEmissor(new Tambor("P", "Giannini" ));
        caixa.adicionarEmissor(new Tambor("G", "Genérica" ));

        //...TODO: COMPLETAR
        caixa.tocarTodosOsEmissores();
    }

}
