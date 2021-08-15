package Controller;



import Model.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class LibrarianLogin extends JFrame {
	static LibrarianLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianLogin();
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
	public LibrarianLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0,0,0, 50));
		panel.setBounds(453, 172, 367, 428);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Name");
		textField.setFont(new Font("FreeSans", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(46, 119, 277, 51);
		panel.add(textField);
		
		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				//System.out.println(name+" "+password);
				if(LibrarianDao.validate(name, password)){
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(LibrarianLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("FreeSans", Font.BOLD, 20));
		button.setBackground(new Color(0, 153, 153));
		button.setBounds(120, 326, 130, 44);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 153));
		panel_1.setBounds(0, 0, 367, 69);
		panel.add(panel_1);
		
		JLabel lblLibrarianLogin = new JLabel("Librarian Login");
		lblLibrarianLogin.setForeground(Color.WHITE);
		lblLibrarianLogin.setFont(new Font("Liberation Sans", Font.PLAIN, 25));
		lblLibrarianLogin.setBounds(139, 8, 183, 55);
		panel_1.add(lblLibrarianLogin);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("image/icon.png"));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(58, 6, 69, 57);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Enter Name");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("FreeSans", Font.PLAIN, 20));
		label_2.setBounds(46, 94, 204, 24);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Enter Password");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("FreeSans", Font.PLAIN, 20));
		label_3.setBounds(46, 203, 204, 24);
		panel.add(label_3);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter Password");
		passwordField.setFont(new Font("FreeSans", Font.PLAIN, 25));
		passwordField.setBounds(46, 228, 277, 51);
		panel.add(passwordField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(UIManager.getBorder("Menu.border"));
		panel_2.setBackground(new Color(0, 0, 0, 50));
		panel_2.setBounds(239, 0, 794, 139);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("Library  Management ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Chilanka", Font.BOLD, 37));
		label.setBounds(213, 29, 396, 63);
		panel_2.add(label);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("image/img3.jpg"));
		label_4.setBounds(-286, 0, 1521, 669);
		contentPane.add(label_4);
	}
}

