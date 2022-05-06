package br.ufpb.dcx.gerentecolecoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemColecionavelTest {

    @Test
    public void testaConstrutores() {
        ItemColecionavel item = new ItemColecionavel();
        assertEquals("", item.getDescricao());
        ItemColecionavel item2 = new ItemColecionavel("Barbie", "04/04/2004", "Barbie Noiva",
                ItemColecionavel.TIPO_BONECAS);
        assertEquals("Barbie Noiva", item2.getDescricao());
    }

    @Test
    public void testaToString() {
        ItemColecionavel item = new ItemColecionavel("War", "05/05/2005", "War III da Grow de 2004",
                ItemColecionavel.TIPO_JOGOS_DE_TABULEIRO);
        assertTrue(item.toString().startsWith("Item colecionável de nome War"));
    }
}
