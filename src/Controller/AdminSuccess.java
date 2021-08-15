package Controller;


import View.*; 
import View.ViewLibrarian;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;



import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Point;

public class AdminSuccess extends JFrame {
	static AdminSuccess frame;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSuccess();
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
	public AdminSuccess() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(51, 0, 0));
		panel.setBounds(405, 42, 842, 98);
		panel.setBackground(new Color(102, 0, 102));
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setBounds(283, 24, 306, 39);
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setFont(new Font("FreeSans", Font.PLAIN, 32));
		lblAdminSection.setForeground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(325, 75, 243, 23);
		contentPane.setLayout(null);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.add(lblAdminSection);
		panel.add(separator);
		
		JLabel lblAddLibrarian = new JLabel("Add Librarian");
		lblAddLibrarian.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblAddLibrarian.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAddLibrarian.setInheritsPopupMenu(false);
		lblAddLibrarian.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblAddLibrarian.setLocation(new Point(5, 5));
		lblAddLibrarian.setIconTextGap(15);
		lblAddLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddLibrarian.setBounds(564, 238, 153, 140);
		contentPane.add(lblAddLibrarian);
		lblAddLibrarian.setBackground(new Color(204, 153, 204));
		lblAddLibrarian.addMouseListener(new MouseAdapter() {
		
			public void mouseEntered(MouseEvent e) {
				lblAddLibrarian.setBackground(new Color(102, 51, 0,80));
			}
			
			public void mouseExited(MouseEvent e) {
				
				lblAddLibrarian.setBackground(new Color(204, 153, 204));
			}
			
			public void mouseClicked(MouseEvent e) {
				LibrarianForm.main(new String[]{});
				frame.dispose();
			}
		});
		lblAddLibrarian.setOpaque(true);
		lblAddLibrarian.setForeground(Color.WHITE);
		lblAddLibrarian.setIcon(new ImageIcon("image/icon1.png"));
		
		JLabel lblViewLibrarian = new JLabel("View Librarian");
		lblViewLibrarian.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				lblViewLibrarian.setBackground(new Color(102, 51, 0,80));
			}
			
			public void mouseExited(MouseEvent e) {
				lblViewLibrarian.setBackground(new Color(204, 153, 204));
			}
		
			public void mouseClicked(MouseEvent e) {
				ViewLibrarian.main(new String[]{});
			}
		});
		lblViewLibrarian.setIcon(new ImageIcon("image/icon3.png"));
		lblViewLibrarian.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblViewLibrarian.setOpaque(true);
		lblViewLibrarian.setLocation(new Point(5, 5));
		lblViewLibrarian.setInheritsPopupMenu(false);
		lblViewLibrarian.setIconTextGap(15);
		lblViewLibrarian.setHorizontalTextPosition(SwingConstants.CENTER);
		lblViewLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewLibrarian.setForeground(Color.WHITE);
		lblViewLibrarian.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblViewLibrarian.setBackground(new Color(204, 153, 204));
		lblViewLibrarian.setBounds(930, 238, 153, 140);
		contentPane.add(lblViewLibrarian);
		
		JLabel lblDeleteLibrarian = new JLabel("Delete");
		lblDeleteLibrarian.addMouseListener(new MouseAdapter() {
		
			public void mouseEntered(MouseEvent e) {
				lblDeleteLibrarian.setBackground(new Color(102, 51, 0,80));
			}
			
			public void mouseExited(MouseEvent e) {
				lblDeleteLibrarian.setBackground(new Color(204, 153, 204));
			}
			
			public void mouseClicked(MouseEvent e) {
				DeleteLibrarian.main(new String[]{});
				frame.dispose();
			}
		});
		lblDeleteLibrarian.setIcon(new ImageIcon("image/icon2.png"));
		lblDeleteLibrarian.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblDeleteLibrarian.setOpaque(true);
		lblDeleteLibrarian.setLocation(new Point(5, 5));
		lblDeleteLibrarian.setInheritsPopupMenu(false);
		lblDeleteLibrarian.setIconTextGap(15);
		lblDeleteLibrarian.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDeleteLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteLibrarian.setForeground(Color.WHITE);
		lblDeleteLibrarian.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblDeleteLibrarian.setBackground(new Color(204, 153, 204));
		lblDeleteLibrarian.setBounds(564, 470, 153, 140);
		contentPane.add(lblDeleteLibrarian);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				lblLogout.setBackground(new Color(102, 51, 0,80));
			}
			
			public void mouseExited(MouseEvent e) {
				lblLogout.setBackground(new Color(204, 153, 204));
			}
			
			public void mouseClicked(MouseEvent e) {
				Library.main(new String[]{});
				frame.dispose();;
			}
		});
		lblLogout.setIcon(new ImageIcon("image/icon10.png"));
		lblLogout.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblLogout.setOpaque(true);
		lblLogout.setLocation(new Point(5, 5));
		lblLogout.setInheritsPopupMenu(false);
		lblLogout.setIconTextGap(15);
		lblLogout.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblLogout.setBackground(new Color(204, 153, 204));
		lblLogout.setBounds(930, 470, 153, 140);
		contentPane.add(lblLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 0, 51));
		panel_1.setBounds(10, 0, 395, 669);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Kinnari", Font.BOLD, 55));
		lblNewLabel.setBounds(60, 245, 234, 75);
		panel_1.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblTo.setForeground(new Color(255, 255, 255));
		lblTo.setBounds(290, 280, 66, 28);
		panel_1.add(lblTo);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Section");
		lblNewLabel_1.setFont(new Font("FreeSans", Font.PLAIN, 43));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(52, 332, 294, 66);
		panel_1.add(lblNewLabel_1);
	}
}
