package Controller;



import Model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;





import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class LibrarianForm extends JFrame {
	static LibrarianForm frame;
	private JPanel contentPane;
	private JTextField txtEnterName;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianForm();
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
	public LibrarianForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblName = new JLabel("First Name:");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblName.setBounds(416, 197, 125, 36);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblPassword.setBounds(431, 276, 110, 36);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblEmail.setBounds(465, 359, 68, 28);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblAddress.setBounds(444, 427, 166, 42);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblCity.setBounds(488, 543, 55, 30);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblContactNo.setBounds(431, 585, 125, 48);
		
		txtEnterName = new JTextField();
		txtEnterName.setFont(new Font("FreeSans", Font.PLAIN, 18));
		txtEnterName.setBounds(602, 201, 192, 30);
		txtEnterName.setColumns(10);
		
		textField_1 = new JTextField();
		
		
		textField_1.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField_1.setBounds(602, 359,192, 30);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField_3.setBounds(602, 544, 192, 30);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField_4.setBounds(602, 595, 192, 30);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("FreeSans", Font.PLAIN, 18));
		passwordField.setBounds(602, 282, 192, 25);
		contentPane.setLayout(null);
		contentPane.add(lblPassword);
		contentPane.add(lblName);
		contentPane.add(lblEmail);
		contentPane.add(lblAddress);
		contentPane.add(lblCity);
		contentPane.add(lblContactNo);
		contentPane.add(textField_4);
		contentPane.add(textField_3);
		contentPane.add(textField_1);
		contentPane.add(txtEnterName);
		contentPane.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(0, 0, 1247, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddLibrarian = new JLabel("Add Librarian");
		lblAddLibrarian.setBounds(513, 24, 255, 56);
		panel.add(lblAddLibrarian);
		lblAddLibrarian.setForeground(new Color(255, 255, 255));
		lblAddLibrarian.setFont(new Font("Liberation Sans", Font.PLAIN, 40));
		
		JLabel lblPincode = new JLabel("Pincode:");
		lblPincode.setFont(new Font("FreeSans", Font.BOLD, 18));
		lblPincode.setBounds(903, 544, 94, 28);
		contentPane.add(lblPincode);
		
		textField = new JTextField();
		textField.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(1025, 544, 192, 30);
		contentPane.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(0, 123, 369, 546);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(73, 54, 218, 217);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/image/img6.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Add Librarian");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(51, 0, 51));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				String name=(txtEnterName.getText()+" "+textField_2.getText());
				String password=String.valueOf(passwordField.getPassword());
				String email=textField_1.getText();
				String address=textField_6.getText();
				String city=(textField_3.getText()+"-"+textField.getText());
				String contact=textField_4.getText();

				int i=LibrarianDao.save(name, password, email, address, city, contact);
				if(i>0){
					JOptionPane.showMessageDialog(LibrarianForm.this,"Librarian added successfully!");
					AdminSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(LibrarianForm.this,"Sorry, unable to save!");
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setBackground(new Color(204, 153, 204,80));
			}
			
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setBackground(new Color(51, 0, 51));
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(0, 338, 369, 56);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setBackground(new Color(51, 0, 51));
		lblBack.setOpaque(true);
		lblBack.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
			
			public void mouseEntered(MouseEvent e) {
				lblBack.setBackground(new Color(204, 153, 204,80));
			}
			
			public void mouseExited(MouseEvent e) {
				lblBack.setBackground(new Color(51, 0, 51));
			}
		});
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setForeground(Color.WHITE);
		lblBack.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblBack.setBounds(0, 395, 369, 56);
		panel_1.add(lblBack);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblLastName.setBounds(874, 197, 133, 36);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(1025, 197, 192, 30);
		contentPane.add(textField_2);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("FreeSans", Font.PLAIN, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(602, 428, 205, 56);
		contentPane.add(textField_6);
	}
}

