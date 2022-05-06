package br.ufpb.dcx.gerentecolecoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SistemaGerenciadorDeColecoesTest {

    @Test
    public void testaAdicionaItem() {
        SistemaGerenciadorDeColecoes sistema = new SistemaGerenciadorDeColecoes();
        ItemColecionavel item = new ItemColecionavel("Azul", "01/01/2021", "Jogo Azul da Galápagos",
                ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO);
        ArrayList<ItemColecionavel> itens = sistema.pesquisarItensComNomeComecandoCom("Azul");
        assertTrue(itens.size() == 0);
        sistema.adicionarItem(item);
        itens = sistema.pesquisarItensComNomeComecandoCom("Azul");
        assertTrue(itens.size() == 1);
        ItemColecionavel itemAchado = itens.get(0);
        assertEquals("Azul", itemAchado.getNome());
        assertEquals("01/01/2021", itemAchado.getDataDeIngressoNaColecao());
        assertEquals("Jogo Azul da Galápagos", itemAchado.getDescricao());
        assertEquals(ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO, itemAchado.getTipo());

    }

    @Test
    public void testaPesquisaPorTipo() {
        SistemaGerenciadorDeColecoes sistema = new SistemaGerenciadorDeColecoes();
        ItemColecionavel item = new ItemColecionavel("Azul", "01/01/2021", "Jogo Azul da Galápagos",
                ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO);
        ArrayList<ItemColecionavel> itens = sistema.pesquisarItensPorTipo(ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO);
        assertEquals(0, itens.size());
        sistema.adicionarItem(item);
        ArrayList<ItemColecionavel> itens2 = sistema.pesquisarItensPorTipo(ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO);
        assertEquals(1, itens2.size());
    }

}
