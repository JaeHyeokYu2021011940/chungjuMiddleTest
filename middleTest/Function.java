package middleTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Function extends FrameAndConfor {
double result;
	
	Function() {
		ActionListener l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource(); 
				String command = e.getActionCommand();
				
				
				if(button.getText() == "1" || button.getText() == "2" || button.getText() == "3" || 
						button.getText() == "4" ||button.getText() == "5" || button.getText() == "6" ||
						button.getText() == "7" ||button.getText() == "8" || button.getText() == "9" || 
				button.getText() == "0" || button.getText() == ".") 
				{
					ta.append(button.getText());
					tf.setText(tf.getText() + button.getText());
				}
				else if(button.getText() == "C") {
					ta.setText("");
					tf.setText("");
					num1 = 0;
					num2 = 0;
					result = 0;
				}
				else if(button.getText() == "+" || button.getText() == "-" || button.getText() == "x" ||
						button.getText() == "÷" ) 
				{
					tf.setText(tf.getText() + button.getText());
					operator = button.getText(); 
					num1 = Double.parseDouble(ta.getText());
				    ta.setText("");
				}
				else if(button.getText()=="=") {
					tf.setText(tf.getText() + button.getText());
					num2 = Double.parseDouble(ta.getText());
					
					if(operator == "+") {
						result = num1 + num2;
					}
				
					else if(operator == "-") {
						result = num1 - num2;
					}
					else if(operator == "x") {
						result = num1 * num2;
					}
					else if(operator == "÷") {
						result = num1 / num2;
					}
					ta.setText(""+result);
					tf.setText(tf.getText() + result);
				}
		        
		    }
		        
			
		};
		
		ActionListener l2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		
		pButton = new JPanel(new GridLayout(5,4));
		
		ce.addActionListener(l);
		c.addActionListener(l);
		square.addActionListener(l);  
		seven.addActionListener(l);
		eight.addActionListener(l);
		nine.addActionListener(l);
		times.addActionListener(l);
		four.addActionListener(l);
		five.addActionListener(l);
		six.addActionListener(l);
		minus.addActionListener(l);
		one.addActionListener(l);
		two.addActionListener(l);
		three.addActionListener(l);
		plus.addActionListener(l);
		divide.addActionListener(l);
		zero.addActionListener(l);
		dot.addActionListener(l);
		equal.addActionListener(l);
	}

}
