package MiddleTest.java;

/**
* 계산기 코드를 실행하는 메인 클래스이다.
* FrameAndConfor 클래스와 Function 클래스의 코드를 접근한다.
*/
public class MiddleTest {
	public static void main(String[] args) {
		new Function();
	}
}

/**
계산기의 각종 프레임과 컨포넌트의 껍데기를 만든 클래스이다.
num1은 계산기의 좌변이고 num2는 우변이다.
result는 결과값이다.
operator는 Function클래스에서 사칙연산의 부호를 구별하는 역할을 한다.
*/
public class FrameAndConfor extends JFrame{
	double num1;
	double num2;
	double result;
	String operator;
}

/**
버튼을 모아둘 격자무늬 패널과 버튼을 만든다.
결과값을 보여줄 Text프레임을 만든다.
*/
JPanel pButton = new JPanel(new GridLayout(5,4));

   JButton square =  new JButton("^");  
   JButton ce =  new JButton("CE"); 
   .
   .
   .
   JPanel pResult = new JPanel(new BorderLayout());
	JTextField tf = new JTextField(10);
	JTextArea ta = new JTextArea(5, 30);

/**
*JFrame의 이름과 배치관리자를 정한다.
*두 텍스트 컨포넌트는 수정이 불가능하다.
*두 텍스트 컨포넌트를 각각 pResult프레임의 중앙과 남쪽에 배치한다. 

*여러 버튼들을 pButton프레임에 배치한다
*결과 패널인 pResult와 버튼패널인 pButton을 각각 북쪽과 중앙에 배치한다

*사이즈는 400*400이다
*보이도록 해놓았다.
*창을 닫으면 어플리케이션도 종료된다..
*/
public FrameAndConfor() {
setTitle("중간고사 대체 과제 계산기 만들기");
		setLayout(new BorderLayout());
		
		ta.setEditable(false);
		tf.setEditable(false);
		pResult.add(ta, BorderLayout.CENTER);
		pResult.add(tf, BorderLayout.SOUTH);
		
		pButton.add(square);
		pButton.add(ce);
		.
		.
		add(pResult, BorderLayout.NORTH);
		add(pButton, BorderLayout.CENTER);
		

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}		


//각종 컨포넌트의 기능을 이벤트로 구현한 클래스이다.
public class Function extends FrameAndConfor {

/**버튼이 숫자인지 확인한다. 1~9까지 숫자일 경우 if문에 true를 반환한다.
*@see ChatGPT
*두 텍스트 컨포넌트에 숫자를 입력한다.
*TextField는 append를 지원하지 않기때문에 문자를 추가하는 식으로 코드를 짠다.
*/
ActionListener l = new ActionListener() {
if(button.getText() == "1" || button.getText() == "2" . . .
      ta.append(button.getText()); 
      tf.setText(tf.getText() + button.getText());
      
/**
*C를 눌렀을 때 모든 입력값이 삭제되는 버튼기능을 만든다. 
*text는 setText에 ""값을 넣는다.
*숫자는 0을 넣는다.
*/     
else if(button.getText() == "C") {

/**
*+ - * / 사칙연산 기능을 하는 버튼이다.
*텍스트필드값을 추가한다.
*operator에 방금 넣은 문자를 넣어 초기화한다. 이는 사칙연산을 구분하는 역할을 한다.
*num1에 지금까지 쓰여진 Text를 실수로 형태를 변화하여 넣어준다.
*TextArea의 공간을 비워준다. 
*/
*else if(button.getText() == "+" || button.getText() == "-" ||                                  
*button.getText() == "x" || . . .} 
						button.getText() == "÷" ) 
				{
					tf.setText(tf.getText() + button.getText());
					operator = button.getText(); 
					num1 = Double.parseDouble(ta.getText());
				    ta.setText("");
				}

/**
*"=" 버튼이 눌러졌을때 기능하는 방식이다.
*텍스트 필드에 String "="을 추가한다.
*num2에 TextArea의 문자열을 실수값으로 바꿔 넣는다.
*조건문으로 operator가 무엇이었는지에 따라 결과를 구하는 방식을 달리한다.
*각 텍스트에 결과값을 저장한다.
*/
else if(button.getText()=="=") {
					tf.setText(tf.getText() + button.getText());
					num2 = Double.parseDouble(ta.getText());


/**
*버튼을 ActionListener에 넣어준다.
*/
ce.addActionListener(l);
		c.addActionListener(l);
		square.addActionListener(l);  
		seven.addActionListener(l);
		.
		.
		.
		


				


