package week9;

import javax.swing.JOptionPane;

public class GradeDemo {

	public static void main(String[] args) {
		
		String input;
		int questions, missed;
		
		input = JOptionPane.showInputDialog("how many questions? ");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("how many missed? ");
		missed= Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(questions,missed);
		exam.display();
		

	}

}
