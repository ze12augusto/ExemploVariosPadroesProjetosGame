package game;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;


/**
 *
 * @author a12027227
 */
public class CenarioTest {
    
    private Cenario cenario;
    @Mock
    private Personagem personagem,
            personagemNoob;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cenario = new Cenario();
    }
    
    @Test
    public void notificaMudancaCenarioQuandoTipoTerrenoForAlterado(){
        
        cenario.addObserver(personagem);
        cenario.setTipoTerreno("terra");
        verify(personagem, atLeastOnce()).mudancaTerreno(anyString());
    }
    
    @Test
    public void notificaMudancaCenarioTodosOsObserversQuandoTipoTerrenoForAlterado(){
        
        cenario.addObserver(personagem);
        cenario.addObserver(personagemNoob);
        cenario.setTipoTerreno("terra");
        verify(personagem, atLeastOnce()).mudancaTerreno(anyString());
        verify(personagemNoob, atLeastOnce()).mudancaTerreno(anyString());
    }
   
}