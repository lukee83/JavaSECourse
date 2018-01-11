package hu.unicon.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientFrame extends JFrame
{

	private JPanel       contentPane;
	private JTextField   textField;
	private ClientThread clientThread;
	public  JTextArea    textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientFrame() 
	{
		setTitle("Uni Chat Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKilps = new JButton("Kil\u00E9p\u00E9s");
		btnKilps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnKilps.setBounds(323, 220, 97, 25);
		contentPane.add(btnKilps);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, -1, 432, 177);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientThread.writeMessage(textField.getText());
				textField.setText("");
				textField.requestFocus();
			}
		});
		textField.setBounds(13, 188, 298, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnKlds = new JButton("K\u00FCld\u00E9s");
		btnKlds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clientThread.writeMessage(textField.getText());
				textField.setText("");
				textField.requestFocus();
			}
		});
		btnKlds.setBounds(323, 188, 97, 25);
		contentPane.add(btnKlds);
		
		clientThread = new ClientThread(this);
	}
	
}
