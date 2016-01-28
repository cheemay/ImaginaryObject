/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionassignment2;

import java.util.Random;

/**
 *
 * @author Dell
 */
public abstract class RationalNumber implements RealNumber {
    
    @Override
    public String getNumber(){              
        return "12.34";
    }
    
    public abstract Object add();
}
