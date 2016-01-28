/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionassignment2;

/**
 *
 * @author Dell
 */
public class TestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RealNumber num = new IntegerNumber();        
        System.out.println("Integer: " + num.getNumber());
        
        RationalNumber num1 = new IntegerNumber();
        System.out.println("Sum of integers: " + num1.add());
        
        num = new SampleRationalNumber();
        System.out.println("Rational: " + num.getNumber());
        
        num1 = new SampleRationalNumber();
        System.out.println("Sum of rationals: " + num1.add());
        
    }
    
}
 