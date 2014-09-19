package game;

import terrenos.GetTerrenoFactory;
import terrenos.Terreno;
import terrenos.TerrenoTerra;

/**
 *
 * @author a12027227
 */
public class Personagem implements Observer{
    
    private GetTerrenoFactory getTerrenoFactory;
    private Terreno terreno = new TerrenoTerra();
    
    public String teclaEspaco(){
        
        return terreno.teclaEspaco();
    }
    
    @Override
    public void mudancaTerreno( String tipoTerreno ){
        
        getTerrenoFactory = GetTerrenoFactory.getInstance();
        terreno = getTerrenoFactory.recuperaAcaoTerreno(tipoTerreno);
    }
}
