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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BooksForm extends JFrame {
	static BooksForm frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new BooksForm();
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
	public BooksForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCallNo = new JLabel("Call No:");
		lblCallNo.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblCallNo.setBounds(566, 172, 107, 38);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblName.setBounds(576, 240, 72, 31);
		
		JLabel lblAuthor = new JLabel("Author:");
		lblAuthor.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblAuthor.setBounds(567, 314, 95, 25);
		
		JLabel lblPublisher = new JLabel("Publisher:");
		lblPublisher.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblPublisher.setBounds(566, 378, 107, 35);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblQuantity.setBounds(566, 451, 107, 32);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setBounds(733, 176, 167, 33);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setBounds(733, 240, 167, 33);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setBounds(733, 311, 167, 33);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setBounds(733, 380, 167, 33);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setBounds(733, 452, 167, 33);
		textField_4.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblName);
		contentPane.add(lblCallNo);
		contentPane.add(lblAuthor);
		contentPane.add(lblPublisher);
		contentPane.add(lblQuantity);
		contentPane.add(textField_4);
		contentPane.add(textField_3);
		contentPane.add(textField_2);
		contentPane.add(textField_1);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(0, 12, 1247, 113);
		contentPane.add(panel);
		
		JLabel lblAddBooks = new JLabel("Add Books");
		lblAddBooks.setForeground(Color.WHITE);
		lblAddBooks.setFont(new Font("Liberation Sans", Font.PLAIN, 40));
		lblAddBooks.setBounds(527, 23, 220, 56);
		panel.add(lblAddBooks);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(-12, 111, 391, 558);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("image/img4.png"));
		label_1.setBounds(89, 50, 218, 217);
		panel_1.add(label_1);
		
		JLabel lblAddBooks_1 = new JLabel("Add Books");
		lblAddBooks_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String callno=textField.getText();
				String name=textField_1.getText();
				String author=textField_2.getText();
				String publisher=textField_3.getText();
				String squantity=textField_4.getText();
				int quantity=Integer.parseInt(squantity);
				String qissued=textField_5.getText();
				int issued=Integer.parseInt(qissued);
				int i=BookDao.save(callno, name, author, publisher, quantity,issued);
				if(i>0){
					JOptionPane.showMessageDialog(BooksForm.this,"Books added successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(BooksForm.this,"Sorry, unable to save!");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAddBooks_1.setBackground(new Color(204, 153, 204,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAddBooks_1.setBackground(new Color(51, 0, 51));
			}
		});
		lblAddBooks_1.setOpaque(true);
		lblAddBooks_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBooks_1.setForeground(Color.WHITE);
		lblAddBooks_1.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblAddBooks_1.setBackground(new Color(51, 0, 51));
		lblAddBooks_1.setBounds(12, 338, 379, 56);
		panel_1.add(lblAddBooks_1);
		
		JLabel label_3 = new JLabel("Back");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
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
		
		JLabel lblIssued = new JLabel("Issued:");
		lblIssued.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblIssued.setBounds(566, 528, 107, 32);
		contentPane.add(lblIssued);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(733, 529, 167, 33);
		contentPane.add(textField_5);
	}
}
