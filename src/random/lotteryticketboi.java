package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryticketboi {
public static void main(String[] args) {
	Random r = new Random();
	String lottery = "";
	for (int i = 0; i <5; i++) {
		int numb = r.nextInt(9);
		lottery += numb + " ";
	}
	JOptionPane.showMessageDialog(null, lottery);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
