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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReturnBook extends JFrame {
	static ReturnBook frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBookCallno = new JLabel("Book Callno:");
		lblBookCallno.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblBookCallno.setBounds(482, 215, 122, 34);
		
		JLabel lblStudentId = new JLabel("Student Id:");
		lblStudentId.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblStudentId.setBounds(498, 282, 117, 34);
		
		textField = new JTextField();
		textField.setBounds(670, 220, 181, 27);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(670, 287, 181, 27);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Note: Check the book properly!");
		lblNewLabel.setBounds(412, 565, 255, 27);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		contentPane.setLayout(null);
		contentPane.add(lblStudentId);
		contentPane.add(lblBookCallno);
		contentPane.add(textField_1);
		contentPane.add(textField);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(UIManager.getColor("OptionPane.errorDialog.titlePane.foreground"));
		panel.setBackground(new Color(102, 0, 102));
		panel.setBounds(-11, 0, 1034, 98);
		contentPane.add(panel);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnBook.setForeground(Color.WHITE);
		lblReturnBook.setFont(new Font("FreeSans", Font.PLAIN, 32));
		lblReturnBook.setBounds(376, 23, 306, 39);
		panel.add(lblReturnBook);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(410, 74, 243, 23);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(-1, 89, 346, 515);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Manage");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("FreeSans", Font.PLAIN, 48));
		label_1.setBounds(43, 79, 171, 81);
		panel_1.add(label_1);
		
		JLabel lblLibraryBooks = new JLabel("Library Books");
		lblLibraryBooks.setForeground(Color.WHITE);
		lblLibraryBooks.setFont(new Font("FreeSans", Font.PLAIN, 39));
		lblLibraryBooks.setBounds(43, 172, 254, 68);
		panel_1.add(lblLibraryBooks);
		
		JLabel lblAll = new JLabel("all");
		lblAll.setForeground(Color.WHITE);
		lblAll.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblAll.setBounds(228, 101, 77, 48);
		panel_1.add(lblAll);
		
		JLabel label_4 = new JLabel("Back");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		label_4.setOpaque(true);
		label_4.setInheritsPopupMenu(false);
		label_4.setIconTextGap(15);
		label_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("FreeSans", Font.PLAIN, 25));
		label_4.setBackground(new Color(51, 0, 51));
		label_4.setBounds(0, 345, 346, 60);
		panel_1.add(label_4);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookcallno=textField.getText();
				int studentid=Integer.parseInt(textField_1.getText());
				int i=ReturnBookDao.delete(bookcallno, studentid);
				if(i>0){
					JOptionPane.showMessageDialog(ReturnBook.this,"Book returned successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(ReturnBook.this,"Sorry, unable to return book!");
				}
			}
		});
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setFont(new Font("FreeSans", Font.PLAIN, 19));
		btnReturn.setBackground(new Color(51, 0, 51));
		btnReturn.setBounds(671, 378, 139, 37);
		contentPane.add(btnReturn);
	}
}

