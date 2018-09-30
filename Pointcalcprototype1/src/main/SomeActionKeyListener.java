package main;
import geometry.Point;
import java.util.regex.*;
import java.awt.event.*;
import exceptions.InvalidExpressionException;
/**SomeActionKeyListener class includes all the implementations of the buttons and also about the operations performed too**/
public class SomeActionKeyListener implements ActionListener{
	/**Point objects p1 and p2**/
	private Point p1=new Point(),p2=new Point();
	private int x=0,y=0,z=0;
	/**Scalar multiplication constant**/
	private double sm=1;
	/**Used in the switch case to determine which operation is to be implemented**/
	private String operator="o";
	/**Checks whether the given text is of the form(x,y) using regex or regular expressions **/
	public boolean checkwhetheritsPoint(String s)
	{
		Pattern pattern=Pattern.compile("\\(-?([0-9]+)?(\\.[0-9]+)?+\\,(-?[0-9]+)?(\\.[0-9]+)?\\)");
		if(!pattern.matcher(s).matches())
			return false;
		else 
			return true;
	}
	/**actionPerformed method,which decides which button is pressed and also implements their operations**/
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("1"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"1");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"1");
				z=0;
			}
		
		}
		if(s.equals("2"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"2");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"2");
				z=0;
			}
		}
		if(s.equals("3"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"3");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"3");
				z=0;
			}
		}
		if(s.equals("4"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"4");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"4");
				z=0;
			}
		}
		if(s.equals("5"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"5");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"5");
				z=0;
			}
		}
		if(s.equals("6"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"6");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"6");
				z=0;
			}
		}
		if(s.equals("7"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"7");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"7");
				z=0;
			}
		}
		if(s.equals("8"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"8");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"8");
				z=0;
			}
		}
		if(s.equals("9"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"9");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"9");
				z=0;
			}
		}
		if(s.equals("-/+"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"-");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"-");
				z=0;
			}
		}
		if(s.equals("0"))
		{
			if(z==0)
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"0");
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"0");
				z=0;
			}
		}
		if(s.equals("AC"))
		{
			z=0;
			operator="o";
			GUI.Jtextfield.setText("");
			p1.setXY(0, 0);
			p2.setXY(0, 0);
			x=0;
		}
		if(s.equals("Eq"))
		{
			System.out.println("EQ");
			if(!operator.equals("o"))
			{
				operator="Eq";
			}
			else if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="Eq";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					z=1;
					GUI.Jtextfield.setText(exp.getMessage());
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="Eq";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
				}
			}
		}
		if(s.equals("+"))
		{
			if(!operator.equals("o"))
			{
				operator="+";
			}
			else if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="+";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					z=1;
					GUI.Jtextfield.setText(exp.getMessage());
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="+";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
					
				}
			}
		}
		if(s.equals("slope"))
		{
			if(!operator.equals("o"))
			{
				operator="slope";
			}
			else if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="slope";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="slope";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
				}
			}
		}
		if(s.equals("edist"))
		{
			if(!operator.equals("o"))
			{
				operator="edist";
			}
			else if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="edist";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="edist";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
				}
		}
		}
		if(s.equals("mdist"))
		{
			if(!operator.equals("o"))
			{
				operator="mdist";
			}
			else if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="mdist";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="mdist";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
				}
			}
		}
		if(s.equals("-"))
		{
			if(!operator.equals("o"))
			{
				operator="-";
			}
			if(GUI.Jtextfield.getText().equals(""))
			{
				p1=new Point();
				operator="-";
				GUI.Jtextfield.setText("");
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="-";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
				}
			}
		}
		if(s.equals("*"))
		{
			if(GUI.Jtextfield.getText().equals(""))
			{
				sm=1;
				operator="*";
			}
			else if(checkwhetheritsPoint(GUI.Jtextfield.getText()))
			{
				operator="*";
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="*";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					GUI.Jtextfield.setText("");
					x=1;
				}
			}
			else
			{
				x=0;
				operator="*";
				try
				{
					sm=Double.parseDouble(GUI.Jtextfield.getText());
					GUI.Jtextfield.setText("");
				}
				catch(Exception exp2)
				{
					GUI.Jtextfield.setText("Invalid scalar factor");
					z=1;
				}
			}
		}
		if(s.equals("quad"))
		{
				operator="quad";
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(Exception exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					z=1;
					flag=true;
				}
				if(!flag)
				{
					String[] a1=GUI.Jtextfield.getText().split("\\(|,|\\)");
					operator="quad";
					p1.setXY(Double.parseDouble(a1[1]),Double.parseDouble(a1[2]));
					int q=p1.quadrant();
					GUI.Jtextfield.setText("");
					if(q==1)
						GUI.Jtextfield.setText("Quadrant 1");
					else if(q==2)
						GUI.Jtextfield.setText("Quadrant 2");
					else if(q==3)
						GUI.Jtextfield.setText("Quadrant 3");
					else if(q==4)
						GUI.Jtextfield.setText("Quadrant 4");
					else if(q==0)
						GUI.Jtextfield.setText("Origin");
					else if(q==-1)
						GUI.Jtextfield.setText("Y-axis");
					else if(q==-2)
						GUI.Jtextfield.setText("X-axis");
					z=1;
				}
		}
		if(s.equals("."))
		{
			if(y==0)
			{
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+".");
				y=1;
			}
		}
		if(s.equals("("))
		{
			if(z==0)
				{
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"(");
				y=0;
				}
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+"(");
				z=0;
				y=0;
			}
		}
		if(s.equals(")"))
		{
			if(z==0)
				{
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+")");
				y=0;
				}
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+")");
				z=0;
				y=0;
			}
		}
		if(s.equals(","))
		{
			if(z==0)
				{
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+",");
				y=0;
				}
			else
			{
				GUI.Jtextfield.setText("");
				GUI.Jtextfield.setText(GUI.Jtextfield.getText()+",");
				z=0;
				y=0;
			}
		}
		if(s.equals("=")&& x==1)
		{
			boolean flag=false;
			System.out.println("b");
			try
			{
				sm=Double.parseDouble(GUI.Jtextfield.getText());
			}catch(Exception ec)
			{
				System.out.println("Invalid scalar factor");
				flag=true;
			}
			if(!flag)
			{
			GUI.Jtextfield.setText("");
			Point r=p1.immutableScalarMultiply(sm);
			GUI.Jtextfield.setText(r.toString());
			operator="o";
			z=1;//when z=1,the screen should be cleared
			y=0;//making sure dot is used only once in a value
			x=0;//Commutative property of scalar product
			}
		}
		else if(s.equals("="))
		{
			if(GUI.Jtextfield.getText().equals(""))
			{
				GUI.Jtextfield.setText("");
				y=0;
			}
			else
			{
				boolean flag=false;
				try
				{
					InvalidExpressionException.checkExpression(GUI.Jtextfield.getText());	
				}
				catch(InvalidExpressionException exp)
				{
					GUI.Jtextfield.setText("");
					GUI.Jtextfield.setText(exp.getMessage());
					flag=true;
				}
				if(!flag)
				{
					//Way to obtain x and y from the String (x,y)
					String[] a2=GUI.Jtextfield.getText().split("\\(|,|\\)");
					p2.setXY(Double.parseDouble(a2[1]),Double.parseDouble(a2[2]));
					//For testing
					System.out.println("p1: "+p1.getX()+" "+p1.getY());
					System.out.println("p2: "+p2.getX()+" "+p2.getY());
					Point r=new Point();
					//which operation is performed as per user choice
					switch(operator)
					{
					case "+":r=p1.sum(p2);
							GUI.Jtextfield.setText("");
							GUI.Jtextfield.setText(r.toString());
							break;
					case "-":r=p1.sub(p2);
							GUI.Jtextfield.setText("");
							GUI.Jtextfield.setText(r.toString());
							break;
					case "*":try
								{
									GUI.Jtextfield.setText("");
									r=p2.immutableScalarMultiply(sm);
									GUI.Jtextfield.setText(r.toString());
								}
								catch(Exception exp2)
								{
									GUI.Jtextfield.setText("Invalid scalar factor");
									z=1;
								}
								break;
					case "edist":GUI.Jtextfield.setText("");
								GUI.Jtextfield.setText(Double.toString(p1.euclidDistance(p2)));
								break;
					case "mdist":GUI.Jtextfield.setText("");
								GUI.Jtextfield.setText(Double.toString(p1.distance(p2)));
								break;
					case "slope":GUI.Jtextfield.setText("");
								double res=p1.slope(p2);
								//System.out.println("res1: "+res);
								if(res==Point.inf)
									GUI.Jtextfield.setText("+ve infinity");
								else if(res==Point.inf*-1)
									GUI.Jtextfield.setText("-ve infinity");
								else
									GUI.Jtextfield.setText(Double.toString(res));
								break;
					case "Eq":	GUI.Jtextfield.setText("");		
								GUI.Jtextfield.setText(p1.equation(p2));
								break;
					default:operator="o";
							z=1;//when z=1,the screen should be cleared
							y=0;//making sure dot is used only once in a value
							x=0;//Commutative property of scalar product
					}
				}
				
			}
		}
	}
}
