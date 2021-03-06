package be.groept.introduction;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//dit is commentaar
public class MyFirstSwingApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstSwingApp window = new MyFirstSwingApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFirstSwingApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JButton btnOpen = new JButton("Open");
		final JEditorPane editorPane = new JEditorPane();
		frame.getContentPane().add(editorPane);
		
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane joptionPane = new JOptionPane();
			String url = joptionPane.showInputDialog("Enter URL");
			try {
				editorPane.setPage(url);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		});
		frame.getContentPane().add(btnOpen);
		
		
	}
}