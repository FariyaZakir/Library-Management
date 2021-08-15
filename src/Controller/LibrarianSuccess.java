package Controller;




import View.*;

import View.ViewBooks;
import View.ViewIssuedBooks;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Point;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianSuccess();
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
	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1247,699);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(51, 0, 51));
		panel.setBounds(0, 0, 395, 669);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Welcome ");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Kinnari", Font.BOLD, 55));
		label.setBounds(60, 245, 234, 75);
		panel.add(label);
		
		JLabel label_1 = new JLabel("to");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		label_1.setBounds(290, 280, 66, 28);
		panel.add(label_1);
		
		JLabel lblLibrarianSection_1 = new JLabel("Librarian Section");
		lblLibrarianSection_1.setForeground(Color.WHITE);
		lblLibrarianSection_1.setFont(new Font("FreeSans", Font.PLAIN, 43));
		lblLibrarianSection_1.setBounds(42, 332, 324, 66);
		panel.add(lblLibrarianSection_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(UIManager.getColor("OptionPane.errorDialog.titlePane.foreground"));
		panel_1.setBackground(new Color(102, 0, 102));
		panel_1.setBounds(394, 41, 853, 98);
		contentPane.add(panel_1);
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianSection.setForeground(Color.WHITE);
		lblLibrarianSection.setFont(new Font("FreeSans", Font.PLAIN, 32));
		lblLibrarianSection.setBounds(283, 24, 306, 39);
		panel_1.add(lblLibrarianSection);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(319, 75, 243, 23);
		panel_1.add(separator);
		
		JLabel lblAddBooks = new JLabel("Add Books");
		lblAddBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BooksForm.main(new String[]{});
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAddBooks.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblAddBooks.setBackground(new Color(204, 153, 204));
			}
		});
		lblAddBooks.setIcon(new ImageIcon("image/icon5.png"));
		lblAddBooks.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblAddBooks.setOpaque(true);
		lblAddBooks.setLocation(new Point(5, 5));
		lblAddBooks.setInheritsPopupMenu(false);
		lblAddBooks.setIconTextGap(15);
		lblAddBooks.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAddBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBooks.setForeground(Color.WHITE);
		lblAddBooks.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblAddBooks.setBackground(new Color(204, 153, 204));
		lblAddBooks.setBounds(463, 230, 153, 140);
		contentPane.add(lblAddBooks);
		
		JLabel lblViewBooks = new JLabel("View Books");
		lblViewBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
					ViewBooks.main(new String[]{});
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewBooks.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblViewBooks.setBackground(new Color(204, 153, 204));
			}
		});
		
		lblViewBooks.setIcon(new ImageIcon("image/icon6.png"));
		lblViewBooks.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblViewBooks.setOpaque(true);
		lblViewBooks.setLocation(new Point(5, 5));
		lblViewBooks.setInheritsPopupMenu(false);
		lblViewBooks.setIconTextGap(15);
		lblViewBooks.setHorizontalTextPosition(SwingConstants.CENTER);
		lblViewBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewBooks.setForeground(Color.WHITE);
		lblViewBooks.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblViewBooks.setBackground(new Color(204, 153, 204));
		lblViewBooks.setBounds(745, 230, 153, 140);
		contentPane.add(lblViewBooks);
		
		JLabel lblIssueBooks = new JLabel("Issue Books");
		lblIssueBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IssueBookForm.main(new String[]{});
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblIssueBooks.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblIssueBooks.setBackground(new Color(204, 153, 204));
			}
		});
		lblIssueBooks.setIcon(new ImageIcon("image/icon7.png"));
		lblIssueBooks.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblIssueBooks.setOpaque(true);
		lblIssueBooks.setLocation(new Point(5, 5));
		lblIssueBooks.setInheritsPopupMenu(false);
		lblIssueBooks.setIconTextGap(15);
		lblIssueBooks.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIssueBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBooks.setForeground(Color.WHITE);
		lblIssueBooks.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblIssueBooks.setBackground(new Color(204, 153, 204));
		lblIssueBooks.setBounds(1032, 230, 153, 140);
		contentPane.add(lblIssueBooks);
		
		JLabel lblViewIsssuedBooks = new JLabel("Issued Books");
		lblViewIsssuedBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblViewIsssuedBooks.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblViewIsssuedBooks.setBackground(new Color(204, 153, 204));
			}
		});
		lblViewIsssuedBooks.setIcon(new ImageIcon("image/icon8.png"));
		lblViewIsssuedBooks.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblViewIsssuedBooks.setOpaque(true);
		lblViewIsssuedBooks.setLocation(new Point(5, 5));
		lblViewIsssuedBooks.setInheritsPopupMenu(false);
		lblViewIsssuedBooks.setIconTextGap(15);
		lblViewIsssuedBooks.setHorizontalTextPosition(SwingConstants.CENTER);
		lblViewIsssuedBooks.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewIsssuedBooks.setForeground(Color.WHITE);
		lblViewIsssuedBooks.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblViewIsssuedBooks.setBackground(new Color(204, 153, 204));
		lblViewIsssuedBooks.setBounds(463, 466, 153, 140);
		contentPane.add(lblViewIsssuedBooks);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReturnBook.main(new String[]{});
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblReturnBook.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblReturnBook.setBackground(new Color(204, 153, 204));
			}
		});
		lblReturnBook.setIcon(new ImageIcon("image/icon9.png"));
		lblReturnBook.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblReturnBook.setOpaque(true);
		lblReturnBook.setLocation(new Point(5, 5));
		lblReturnBook.setInheritsPopupMenu(false);
		lblReturnBook.setIconTextGap(15);
		lblReturnBook.setHorizontalTextPosition(SwingConstants.CENTER);
		lblReturnBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnBook.setForeground(Color.WHITE);
		lblReturnBook.setFont(new Font("FreeSans", Font.BOLD, 20));
		lblReturnBook.setBackground(new Color(204, 153, 204));
		lblReturnBook.setBounds(745, 466, 153, 140);
		contentPane.add(lblReturnBook);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setBackground(new Color(102, 51, 0,80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setBackground(new Color(204, 153, 204));
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
		lblLogout.setBounds(1032, 466, 153, 140);
		contentPane.add(lblLogout);
	}

}


