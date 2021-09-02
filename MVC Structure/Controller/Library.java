package Controller;


import Controller.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library extends JFrame {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Library();
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
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1247, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBackground(new Color(0, 0, 0,80));
		btnAdminLogin.setForeground(new Color(255, 255, 204));
		btnAdminLogin.setBounds(477, 362, 337, 52);
		btnAdminLogin.setBorderPainted(false);
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AdminLogin.main(new String[]{});
			
			}
		});
		btnAdminLogin.setFont(new Font("Century Schoolbook L", Font.BOLD, 24));
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setForeground(new Color(255, 255, 204));
		btnLibrarianLogin.setBackground(new Color(0, 0,0,80));
		btnLibrarianLogin.setBounds(477, 466, 337, 53);
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[]{});
			}
		});
		btnLibrarianLogin.setFont(new Font("Century Schoolbook L", Font.BOLD, 23));
		contentPane.setLayout(null);
		contentPane.add(btnLibrarianLogin);
		contentPane.add(btnAdminLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("Menu.border"));
		panel_1.setBackground(new Color(0, 0,0,80));
		panel_1.setBounds(229, 93, 794, 139);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLibraryManagement = new JLabel("Library Management ");
		lblLibraryManagement.setBounds(231, 43, 378, 63);
		panel_1.add(lblLibraryManagement);
		lblLibraryManagement.setForeground(new Color(255, 255, 255));
		lblLibraryManagement.setFont(new Font("Chilanka", Font.BOLD, 37));
		

		
		JLabel lblNewLabel = new JLabel("",new ImageIcon("image/img1.jpg"),SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(-18,-80,1343,749);
		contentPane.add(lblNewLabel);
	}
}


