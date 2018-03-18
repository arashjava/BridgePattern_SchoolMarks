/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybridgepattern;

/**
 *
 * @author arash
 */
public class MidTerm implements IExam{
    private double mark; 

    public MidTerm(double mark) {
        this.mark = mark;
    }
    
    @Override
    public void showResult() {
        System.out.println(" Mid-Term result is "+ mark);
    }
    
}
