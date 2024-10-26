package middleTest;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameAndConfor extends JFrame{
	double num1;
	double num2;
	double result;
	
	String operator;
	JPanel pButton = new JPanel(new GridLayout(5,4));
	
	JButton square =  new JButton("^");  
	JButton ce =  new JButton("CE"); 
	JButton c =  new JButton("C");
	JButton eraser =  new JButton("<-");
	JButton seven =  new JButton("7");
	JButton eight =  new JButton("8");
	JButton nine = new JButton("9");
	JButton times = new JButton("x");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton minus = new JButton("-");
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton plus = new JButton("+");
	JButton divide = new JButton("÷");
	JButton zero = new JButton("0");
	JButton dot = new JButton(".");
	JButton equal = new JButton("=");
	
	
	JPanel pResult = new JPanel(new BorderLayout());
	JTextField tf = new JTextField(10);
	JTextArea ta = new JTextArea(5, 30);
	
	

	public FrameAndConfor() {
	
		setTitle("중간고사 대체 과제 계산기 만들기");
		setLayout(new BorderLayout());
		
		
		ta.setEditable(false);
		tf.setEditable(false);
		pResult.add(ta, BorderLayout.CENTER);
		pResult.add(tf, BorderLayout.SOUTH);
		
		pButton.add(square);
		pButton.add(ce);
		pButton.add(c);
		pButton.add(eraser);
		pButton.add(seven);
		pButton.add(eight);
		pButton.add(nine);
		pButton.add(times);
		pButton.add(four);
		pButton.add(five);
		pButton.add(six);
		pButton.add(minus);
		pButton.add(one);
		pButton.add(two);
		pButton.add(three);
		pButton.add(plus);
		pButton.add(divide);
		pButton.add(zero);
		pButton.add(dot);
		pButton.add(equal);
		
		
		

		add(pResult, BorderLayout.NORTH);
		add(pButton, BorderLayout.CENTER);
		

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
