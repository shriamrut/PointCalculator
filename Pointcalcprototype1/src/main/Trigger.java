package main;

import javax.swing.UIManager;

public class Trigger {
	public static void main(String[] arg)
	{
		//What is this???
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
		}
		GUI g=new GUI();
		g.setTitle("Point Calculator");
		g.pack();
		g.setVisible(true);
	}

}
