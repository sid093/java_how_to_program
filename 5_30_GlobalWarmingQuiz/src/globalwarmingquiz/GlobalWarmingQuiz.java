/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package globalwarmingquiz;

/**
 *
 * @author sid
 */
public class GlobalWarmingQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        quiz testQuiz = new quiz();
        question[] qToAdd = new question[8];
        question temp;
        //dummy questions andc choices
        String[] options = {"1", "2", "3", "4"}; 
        qToAdd[0] = new question("What is 1 + 1?", options, 2);
        qToAdd[1] = new question("What is 1 + 0?", options, 1);
        qToAdd[2] = new question("What is 1 + 2?", options, 3);
        qToAdd[3] = new question("What is 1 + 3?", options, 4);
        qToAdd[4] = new question("What is 1 * 1?", options, 2);
        qToAdd[5] = new question("What is 2 - 1?", options, 1);
        qToAdd[6] = new question("What is 3 * 1?", options, 3);
        qToAdd[7] = new question("What is 2 * 2?", options, 4);
        testQuiz.addQuestion(qToAdd); //adding questions as an array
        temp = new question("What is 1 * 2?", options, 2);
        testQuiz.addQuestion(temp); //adding questions as single object
        testQuiz.playQuiz(5);
        
        // TODO code application logic here
    }
    
}
