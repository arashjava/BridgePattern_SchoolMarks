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
public class MyBridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Result for Bob Jones: ");
        System.out.println("-------------------------");
        ACourse course1= new Android(new Lab(86.4), new MidTerm(93.2), new Final(81.6));
        course1.showResults();
        System.out.println("-------------");
        ACourse course2= new Java(new Lab(88.5), new MidTerm(91.2), new Final(87.7));
        course2.showResults();
        System.out.println("-------------");

        ACourse course3= new Java(new Lab(79.1), new MidTerm(83.7), new Final(97.1));
        course3.showResults();

    }
    
}
