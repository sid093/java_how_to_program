/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package globalwarmingquiz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sid
 */
public class quiz {
    private ArrayList <question> questions;
    private int numOfQuestions;
    private int points;
    
    public quiz()
    {
        points = 0;
        numOfQuestions = 0;
        questions = new ArrayList<question>();
    }
    
    public void addQuestion(question... add) //ellipsis allows variable argument list
    {
        questions.addAll(Arrays.asList(add));
        System.out.println("Number of questions currently is: " + questions.size());
    }
    
    public void playQuiz(int num)
    {
        Scanner in = new Scanner(System.in);
        int current;
        Random randomNumber = new Random();
        int tempRandom;
        int choice;
        numOfQuestions = num;
        if(numOfQuestions > questions.size())
        {
            System.out.println("Add more questions before you can play");
            return;
        }
        for(current = 1; current <=numOfQuestions; ++current)
        {
            tempRandom = randomNumber.nextInt(questions.size());
            while(questions.get(tempRandom).isDone())
                tempRandom = randomNumber.nextInt(questions.size());
            System.out.print(current + ". ");
            questions.get(tempRandom).display();
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            if(questions.get(tempRandom).isCorrect(choice))
                points += 1;
        }
        System.out.println("Your points are: " + points);
    }
    
}

class question {
    private String questionText;
    private String[] choices;
    private int correctChoice;
    private boolean done;            
    
    public question(String q, String[] options, int correct)
    {
        choices = new String[4];
        questionText = q;
        choices = options;
        correctChoice = correct;
        done = false;
    }
    
    public void setCorrect(int correct)
    {
        correctChoice = correct;
    }
    
    public void display()
    {
        System.out.println("Question: " + questionText);
        System.out.println("Choices- ");
        for(int i=1; i<=4; ++i)
            System.out.println(i + ". " + choices[i-1]);
        //System.out.println("Correct choice: " + correctChoice);
    }
    
    public boolean isCorrect(int choice)
    {
        if(done == true)
        {
            System.out.println("Question already done");
            return false;
        }
        done = true;
        if(choice == correctChoice)
        {
            System.out.println("Your choice is correct!");
            return true;
        }
        else
        {
            System.out.println("Your choice is wrong!");
            return false;
        }
    }
    
    public boolean isDone()
    {
        return done;
    }
}
