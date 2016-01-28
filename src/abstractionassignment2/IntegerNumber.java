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
public class IntegerNumber extends RationalNumber{
    
    @Override
    public String getNumber(){
        return "1234";
    }
    @Override
    public Object add(){
        int x, y;
        x = 1;
        y = 2;
        return (x+y);
    }
}
