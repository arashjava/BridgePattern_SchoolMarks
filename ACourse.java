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
abstract class ACourse {
    protected IExam exam1;
    protected IExam exam2;
    protected IExam exam3;
    

    public ACourse(IExam exam1, IExam exam2, IExam exam3) {
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }
    
    abstract public void showResults();
}
