package Controller;



import Model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteLibrarian extends JFrame {
	static DeleteLibrarian frame;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DeleteLibrarian();
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
	public DeleteLibrarian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 634);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEnterId = new JLabel("Enter Id:");
		lblEnterId.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblEnterId.setBounds(475, 196, 129, 37);
		
		textField = new JTextField();
		textField.setFont(new Font("FreeSans", Font.PLAIN, 20));
		textField.setBounds(645, 203, 178, 27);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(51, 0, 51));
		btnDelete.setBounds(684, 325, 139, 37);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=textField.getText();
				if(sid==null||sid.trim().equals("")){
					JOptionPane.showMessageDialog(DeleteLibrarian.this,"Id can't be blank");
				}else{
					int id=Integer.parseInt(sid);
					int i=LibrarianDao.delete(id);
					if(i>0){
						JOptionPane.showMessageDialog(DeleteLibrarian.this,"Record deleted successfully!");
					}else{
						JOptionPane.showMessageDialog(DeleteLibrarian.this,"Unable to delete given id!");
					}
				}
			}
		});
		btnDelete.setFont(new Font("FreeSans", Font.PLAIN, 19));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1034, 103);
		panel.setLayout(null);
		panel.setForeground(UIManager.getColor("OptionPane.errorDialog.titlePane.foreground"));
		panel.setBackground(new Color(102, 0, 102));
		
		JLabel lblDeleteLibrarian = new JLabel("Delete Librarian");
		lblDeleteLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteLibrarian.setForeground(Color.WHITE);
		lblDeleteLibrarian.setFont(new Font("FreeSans", Font.PLAIN, 32));
		lblDeleteLibrarian.setBounds(376, 23, 306, 39);
		panel.add(lblDeleteLibrarian);
		contentPane.setLayout(null);
		contentPane.add(lblEnterId);
		contentPane.add(textField);
		contentPane.add(btnDelete);
		contentPane.add(panel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(410, 74, 243, 23);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(0, 101, 346, 503);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Manage");
		lblNewLabel.setFont(new Font("FreeSans", Font.PLAIN, 43));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(43, 79, 157, 81);
		panel_1.add(lblNewLabel);
		
		JLabel lblLibrarians = new JLabel("Librarians");
		lblLibrarians.setForeground(Color.WHITE);
		lblLibrarians.setFont(new Font("FreeSans", Font.PLAIN, 43));
		lblLibrarians.setBounds(86, 155, 193, 81);
		panel_1.add(lblLibrarians);
		
		JLabel lblYour = new JLabel("your");
		lblYour.setForeground(Color.WHITE);
		lblYour.setFont(new Font("FreeSans", Font.PLAIN, 30));
		lblYour.setBounds(212, 99, 77, 48);
		panel_1.add(lblYour);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setBounds(0, 353, 346, 60);
		panel_1.add(lblBack);
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
		lblBack.setOpaque(true);
		lblBack.setInheritsPopupMenu(false);
		lblBack.setIconTextGap(15);
		lblBack.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setForeground(new Color(255, 255, 255));
		lblBack.setFont(new Font("FreeSans", Font.PLAIN, 25));
		lblBack.setBackground(new Color(51, 0, 51));
	}
}

