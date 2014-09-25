package terrenos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a12027227
 */
public class GetTerrenoFactoryTest {
    
    private GetTerrenoFactory getTerrenoFactory;
    private String tipoTerrenoTerra = "terra";
    private String tipoTerrenoAgua = "agua";
    private String tipoTerrenoInvalido = "areia";
    
    @Before
    public void setUp() {
        getTerrenoFactory = GetTerrenoFactory.getInstance();
    }
    
    @Test
    public void recuperaAcaoTerrenoDeveriaRetornaInstanciaTerrenoTerraQuandoTipoTerrenoPassadoForTerra() {
        
        Terreno terrenoRetorno = getTerrenoFactory.recuperaAcaoTerreno(tipoTerrenoTerra);
        assertTrue( terrenoRetorno instanceof TerrenoTerra);
    }
    
    @Test
    public void recuperaAcaoTerrenoDeveriaRetornaInstanciaTerrenoAguaQuandoTipoTerrenoPassadoForAgua() {
        
        Terreno terrenoRetorno = getTerrenoFactory.recuperaAcaoTerreno(tipoTerrenoAgua);
        assertTrue( terrenoRetorno instanceof TerrenoAgua);
    }
    
    @Test
    public void recuperaAcaoTerrenoDeveriaRetornaInstanciaTerrenoTerraQuandoTipoTerrenoPassadoForInvalido() {
        
        Terreno terrenoRetorno = getTerrenoFactory.recuperaAcaoTerreno(tipoTerrenoInvalido);
        assertTrue( terrenoRetorno instanceof TerrenoTerra);
    }
}   

