package week9;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity {
	private int numQuestions; // number of questions
	private double pointsEach;// marks for each question
	private int numMissed;// questions missed

	public FinalExam(int numQuestions, int numMissed) {

		this.numQuestions = numQuestions;
		this.numMissed = numMissed;

		pointsEach = 100.0 / numQuestions;

		double score = 100 - (numMissed * pointsEach);
		setScore(score);
	}
	
	public void foo() {
		System.out.println(score);
		
	}
	
	public void display() {
		JOptionPane.showMessageDialog(null, "Each question counts " + pointsEach + "\nYour grade is: " + getScore());
		super.display();
	}

}
