package hu.unicon.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
/*import java.awt.event.KeyListener;
import java.awt.event.WindowListener; + ActionListener will be needed
*/
import java.awt.event.*;

// AWT
// Swing is easier but ... (graphical editor

public class MyWindow extends Frame implements WindowListener, ActionListener
{

	public MyWindow() throws HeadlessException 
	{
		// super();
		setVisible(true);
		setSize(300, 200);
		setLocation(100, 100);
		
		// for dispose()
		addWindowListener(this);
		
		Button Jenson = new Button("Change title");
		Jenson.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(Jenson);
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose(); // call destructor
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// new MyWindow();
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	// for ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		setTitle("New Title of the Window");
		
	}
	
	
}
