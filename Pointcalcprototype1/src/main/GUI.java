package main;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**The GUI or Graphical user Interface class,contains of components like buttons,text field,etc of the interface**/
public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	static JTextField Jtextfield;
	//Buttons used
	JButton n1=new JButton("1");
	JButton n2=new JButton("2");
	JButton n3=new JButton("3");
	JButton n4=new JButton("4");
	JButton n5=new JButton("5");
	JButton n6=new JButton("6");
	JButton n7=new JButton("7");
	JButton n8=new JButton("8");
	JButton n9=new JButton("9");
	JButton n0=new JButton("0");
	JButton comma=new JButton(",");
	JButton openb=new JButton("(");
	JButton closeb=new JButton(")");
	JButton dist1=new JButton("edist");
	JButton dist2=new JButton("mdist");
	JButton slp=new JButton("slope");
	JButton eq=new JButton("Eq");
	JButton qd=new JButton("quad");
	JButton ac=new JButton("AC");
	JButton dot=new JButton(".");
	JButton add=new JButton("+");
	JButton sub=new JButton("-");
	JButton smul=new JButton("*");
	JButton equalto=new JButton("=");
	JButton sign=new JButton("-/+");
	
	//textpanel and buttonpanel
	JPanel textPanel,buttonPanel;
	Container cont;
	/**GUI() constructor **/
	public GUI()
	{
		cont=getContentPane();
		cont.setLayout(new BorderLayout());
		textPanel=new JPanel();
		buttonPanel=new JPanel();
		Jtextfield=new JTextField(33);
		Jtextfield.setHorizontalAlignment(SwingConstants.LEFT);//???
		Jtextfield.addKeyListener(new KeyAdapter()
			{
			public void keyTyped(KeyEvent keyevent) {
				char c = keyevent.getKeyChar();
				if ((c >= '0' && c <= '9')||c=='.'||c==','||c=='('||c==')') {
				} else {
					keyevent.consume();
				}
			}
			});
		textPanel.add(Jtextfield);
		buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4,3,3));
		ActionListener bl=new SomeActionKeyListener();
		
		textPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		buttonPanel.add(n1);
		n1.addActionListener(bl);
		
		
		buttonPanel.add(n2);
		n2.addActionListener(bl);
		
		buttonPanel.add(n3);
		n3.addActionListener(bl);
		
		buttonPanel.add(n4);
		n4.addActionListener(bl);
		
		buttonPanel.add(n5);
		n5.addActionListener(bl);
		
		buttonPanel.add(n6);
		n6.addActionListener(bl);
		
		buttonPanel.add(n7);
		n7.addActionListener(bl);
		
		buttonPanel.add(n8);
		n8.addActionListener(bl);
		
		buttonPanel.add(n9);
		n9.addActionListener(bl);
		
		buttonPanel.add(n0);
		n0.addActionListener(bl);
		
		buttonPanel.add(comma);
		comma.addActionListener(bl);
		comma.setBackground(Color.orange);
		
		buttonPanel.add(openb);
		openb.addActionListener(bl);
		openb.setBackground(Color.orange);
		
		
		buttonPanel.add(closeb);
		closeb.addActionListener(bl);
		closeb.setBackground(Color.orange);
		
		buttonPanel.add(qd);
		qd.setMnemonic(KeyEvent.VK_D);
		qd.addActionListener(bl);
		qd.setBackground(Color.orange);
		qd.setToolTipText("Quadrant of a Point (x,y),shortcut:Alt + D");
		
		buttonPanel.add(dot);
		dot.addActionListener(bl);
		dot.setBackground(Color.orange);
		
		buttonPanel.add(add);
		add.addActionListener(bl);
		add.setBackground(Color.orange);
		add.setToolTipText("adds (x1,y1) and (x2,y2),shortcut:Alt+A");
		add.setMnemonic(KeyEvent.VK_A);
		
		buttonPanel.add(sub);
		sub.addActionListener(bl);
		sub.setBackground(Color.orange);
		sub.setToolTipText("subtracts (x2,y2) from (x1,y1),shortcut:Alt+S");
		sub.setMnemonic(KeyEvent.VK_S);
		
		buttonPanel.add(smul);
		smul.addActionListener(bl);
		smul.setBackground(Color.orange);
		smul.setMnemonic(KeyEvent.VK_W);
		smul.setToolTipText("Scalar Multiplication c*(x1,y1) or (x1,y1)*c,shortcut:Alt+ W ");
		
		buttonPanel.add(sign);
		sign.addActionListener(bl);
		sign.setBackground(Color.orange);
		sign.setToolTipText("Making the value negative,shortcut:Alt+N");
		sign.setMnemonic(KeyEvent.VK_N);
		
		buttonPanel.add(dist1);
		dist1.addActionListener(bl);
		dist1.setBackground(Color.orange);
		dist1.setMnemonic(KeyEvent.VK_E);
		dist1.setToolTipText("Calculates the euclidean distance from (x1,y1) and (x2,y2),shortcut:Alt+E");
		
		buttonPanel.add(dist2);
		dist2.addActionListener(bl);
		dist2.setBackground(Color.orange);
		dist2.setMnemonic(KeyEvent.VK_M);
		dist2.setToolTipText("Calculates the manhatten distance from (x1,y1) and (x2,y2),Alt+M");
		
		buttonPanel.add(slp);
		slp.addActionListener(bl);
		slp.setBackground(Color.ORANGE);
		slp.setMnemonic(KeyEvent.VK_P);
		slp.setToolTipText("Calculates the slope between (x1,y1) and (x2,y2),shortcut:Alt+P");
		
		buttonPanel.add(eq);
		eq.addActionListener(bl);
		eq.setBackground(Color.orange);
		eq.setMnemonic(KeyEvent.VK_Q);
		eq.setToolTipText("Equation of the line formed by point (x1,y1) and (x2,y2),shortcut:Alt+Q");
		
		buttonPanel.add(ac);
		ac.addActionListener(bl);
		ac.setBackground(Color.red);
		ac.setMnemonic(KeyEvent.VK_C);
		ac.setToolTipText("Clears the screen and also the memory,by default points are (0,0),shortcut:Alt+C");
		
		buttonPanel.add(equalto);
		equalto.addActionListener(bl);
		equalto.setMnemonic(KeyEvent.VK_ENTER);
		equalto.setBackground(Color.green);
		equalto.setToolTipText("Gives your answer,shortcut:Alt+Enter");
		
		
		cont.add("Center", buttonPanel);
		cont.add("North", textPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}
