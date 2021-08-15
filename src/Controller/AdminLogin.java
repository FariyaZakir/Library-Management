package Controller;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

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

public class AdminLogin extends JFrame {
	static AdminLogin frame;
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
					frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255,20));
		panel.setBounds(454, 188, 367, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("FreeSans", Font.PLAIN, 25));
		textField.setToolTipText("Enter Name");
		textField.setColumns(10);
		textField.setBounds(46, 119, 277, 51);
		panel.add(textField);
		


		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("FreeSans", Font.BOLD, 20));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(102, 51, 51));
		btnLogin.setBounds(120, 326, 130, 44);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			if(name.equals("admin")&&password.equals("admin123")){
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				textField.setText("");
				passwordField.setText("");
			}
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 51, 51));
		panel_1.setBounds(0, 0, 367, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login");
		lblAdminLoginForm.setForeground(new Color(255, 255, 255));
		lblAdminLoginForm.setFont(new Font("Liberation Sans", Font.PLAIN, 25));
		lblAdminLoginForm.setBounds(144, 8, 160, 55);
		panel_1.add(lblAdminLoginForm);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(71, 8, 69, 57);
		panel_1.add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("image/icon.png"));
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setForeground(Color.WHITE);
		lblEnterName.setFont(new Font("FreeSans", Font.PLAIN, 20));
		lblEnterName.setBounds(46, 94, 204, 24);
		panel.add(lblEnterName);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setFont(new Font("FreeSans", Font.PLAIN, 20));
		lblEnterPassword.setBounds(46, 203, 204, 24);
		panel.add(lblEnterPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(245, 12, 794, 139);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(UIManager.getBorder("Menu.border"));
		panel_2.setBackground(new Color(0, 0, 0, 50));
		
		JLabel label_2 = new JLabel("Library  Management ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Chilanka", Font.BOLD, 37));
		label_2.setBounds(202, 31, 396, 63);
		panel_2.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("image/img2.jpg"));
		lblNewLabel_1.setBounds(-274, 0, 1521, 657);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("FreeSans", Font.PLAIN, 25));
		passwordField.setToolTipText("Enter Password");
		passwordField.setBounds(46, 228, 277, 51);
		panel.add(passwordField);
	
	}
}
