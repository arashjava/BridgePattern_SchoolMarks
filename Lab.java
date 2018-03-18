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
public class Lab implements IExam{
    private double mark; 

    public Lab(double mark) {
        this.mark = mark;
    }
    
    
    @Override
    public void showResult() {
         System.out.println(" Lab result is "+ mark);
    }
    
}
