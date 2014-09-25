package game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a12027227
 */
public class PersonagemTest {
    
    private Personagem personagem;
    private String tipoTerrenoTerra = "terra";
    private String tipoTerrenoAgua = "agua";
    private String terrenoTerraMensagem = "Personagem da um salto ao pressionar tecla espaco";
    private String terrenoAguaMensagem = "Não faz nada na agua quando tecla espaco e pressionada";
    
    @Before
    public void setUp() {
        personagem = new Personagem();
    }

    @Test
    public void teclaEspacoDefaultDeveriaRetornaMensagemTerrenoTerra() {
        
        String retorno = personagem.teclaEspaco();
        assertEquals(terrenoTerraMensagem, retorno);
    }
    
    @Test
    public void teclaEspacoQuandoHouveMudancaTerrenoParaAgua(){
        
        personagem.mudancaTerreno(tipoTerrenoAgua);
        String retorno = personagem.teclaEspaco();
        assertEquals(terrenoAguaMensagem, retorno);
    }
    
    @Test
    public void teclaEspacoQuandoHouveMudancaTerrenoParaTerra(){
        
        personagem.mudancaTerreno(tipoTerrenoAgua);
        personagem.mudancaTerreno(tipoTerrenoTerra);
        String retorno = personagem.teclaEspaco();
        assertEquals(terrenoTerraMensagem, retorno);
    }
}