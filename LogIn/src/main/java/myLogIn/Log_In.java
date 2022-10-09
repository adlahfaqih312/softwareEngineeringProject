package myLogIn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Log_In extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_In frame = new Log_In();
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
	public Log_In() {
		setBackground(new Color(0, 128, 192));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel WelcomeLabel = new JLabel("Welcome");
		WelcomeLabel.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 25));
		WelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLabel.setBounds(214, 52, 150, 50);
		contentPane.add(WelcomeLabel);
		
		JLabel UsernameLabel = new JLabel("Username :");
		UsernameLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 18));
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setBounds(100, 120, 120, 31);
		contentPane.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password :");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 18));
		PasswordLabel.setBounds(100, 175, 120, 31);
		contentPane.add(PasswordLabel);
		
		username = new JTextField();
		username.setBounds(230, 120, 200, 35);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(228, 174, 200, 35);
		contentPane.add(password);
		
		JButton login = new JButton("LogIn");
		login.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 18));
		login.setBounds(202, 233, 110, 35);
		contentPane.add(login);
		
		JButton signup = new JButton("SignUp");
		signup.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 18));
		signup.setBounds(320, 233, 110, 35);
		contentPane.add(signup);
	}
}
