package Controller;


import Model.*;
import View.*; 
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class IssueBookForm extends JFrame {
	static IssueBookForm frame;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new IssueBookForm();
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
	public IssueBookForm() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBookName = new JLabel("Book Callno:");
		lblBookName.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblBookName.setBounds(607, 229, 150, 32);
		
		textField_1 = new JTextField();
		textField_1.setBounds(806, 229, 187, 31);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(806, 293, 187, 31);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(806, 370, 187, 31);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(806, 442, 187, 31);
		textField_4.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student Id:");
		lblStudentId.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblStudentId.setBounds(618, 293, 139, 32);
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblStudentName.setBounds(585, 370, 172, 32);
		
		JLabel lblStudentContact = new JLabel("Student Contact:");
		lblStudentContact.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblStudentContact.setBounds(574, 442, 172, 40);
		
		JLabel lblNewLabel_1 = new JLabel("Note: Please check Student ID Carefully before issuing book!");
		lblNewLabel_1.setBounds(552, 619, 396, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.RED);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1247, 113);
		panel.setLayout(null);
		panel.setBackground(new Color(102, 0, 102));
		
		JLabel lblIssueBook_1 = new JLabel("Issue Book");
		lblIssueBook_1.setForeground(Color.WHITE);
		lblIssueBook_1.setFont(new Font("Liberation Sans", Font.PLAIN, 40));
		lblIssueBook_1.setBounds(527, 23, 220, 56);
		panel.add(lblIssueBook_1);
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(508, 75, 237, 10);
		panel.add(separator);
		contentPane.add(lblBookName);
		contentPane.add(lblStudentId);
		contentPane.add(lblStudentName);
		contentPane.add(lblStudentContact);
		contentPane.add(textField_2);
		contentPane.add(textField_1);
		contentPane.add(textField_3);
		contentPane.add(textField_4);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(0, 111, 391, 558);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("image/img5.png"));
		label_1.setBounds(89, 50, 218, 217);
		panel_1.add(label_1);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				String bookcallno=textField_1.getText();
				int studentid=Integer.parseInt(textField_2.getText());
				String studentname=textField_3.getText();
				String studentcontact=textField_4.getText();
				
				if(IssueBookDao.checkBook(bookcallno)){
				
				int i=IssueBookDao.save(bookcallno, studentid, studentname, studentcontact);
				if(i>0){
					JOptionPane.showMessageDialog(IssueBookForm.this,"Book issued successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, unable to issue!");
				}//end of save if-else
				
				}else{
					JOptionPane.showMessageDialog(IssueBookForm.this,"Sorry, Callno doesn't exist!");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblIssueBook.setBackground(new Color(204, 153, 204,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblIssueBook.setBackground(new Color(51, 0, 51));
			}
		});
		lblIssueBook.setOpaque(true);
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setForeground(Color.WHITE);
		lblIssueBook.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblIssueBook.setBackground(new Color(51, 0, 51));
		lblIssueBook.setBounds(12, 338, 379, 56);
		panel_1.add(lblIssueBook);
		
		JLabel label_3 = new JLabel("Back");
		label_3.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_3.setBackground(new Color(204, 153, 204,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_3.setBackground(new Color(51, 0, 51));
			}
		});
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("FreeSans", Font.PLAIN, 30));
		label_3.setBackground(new Color(51, 0, 51));
		label_3.setBounds(12, 395, 379, 56);
		panel_1.add(label_3);
	}
}

