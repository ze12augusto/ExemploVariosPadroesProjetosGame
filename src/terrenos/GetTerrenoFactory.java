package terrenos;

import terrenos.TerrenoAgua;
import terrenos.Terreno;
import terrenos.TerrenoTerra;

/**
 *
 * @author a12027227
 */
public class GetTerrenoFactory {

    private static GetTerrenoFactory instance;
    
    public static GetTerrenoFactory getInstance(){
        
        if( instance == null ){
            instance = new GetTerrenoFactory();
        }
        
        return instance;
    }
    private GetTerrenoFactory() {}
    
    public Terreno recuperaAcaoTerreno( String tipoTerreno ){
        
        if( tipoTerreno.equals("agua") ){
            return new TerrenoAgua();
        }
        
        return new TerrenoTerra();
    }
}
