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
public class Java extends ACourse{
    
    public Java(IExam exam1, IExam exam2, IExam exam3) {
        super(exam1, exam2, exam3);
    }

    @Override
    public void showResults() {
        System.out.println("Java -");
        exam1.showResult();
        exam2.showResult();
        exam3.showResult();
    }


}
