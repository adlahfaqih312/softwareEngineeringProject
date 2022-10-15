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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Log_In  {
	private String username;
	private int password;
	List<String> loginInfo1=new ArrayList<>();//for username
	List<Integer> loginInfo2=new ArrayList<>();//for password
	public Log_In() {
		
	}
	public Log_In(int pass) {
		this.password=pass;
	}
	public Log_In(String user) {
		this.username=user;
	}
	public Log_In(String user,int pass) {
		this.setUsername(user);
		this.setPassword(pass);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public List<String> getUserName(){
		
		loginInfo1.add("Adlah");
		loginInfo1.add("Masa");
		loginInfo1.add("Arwa");
		
		return loginInfo1;
		
	}
	public List<Integer> getPassWord(){
		
		loginInfo2.add(12345);
		loginInfo2.add(12345);
		loginInfo2.add(12345);
		
		
		return loginInfo2;
		
	}
	public void addToList(Log_In userName2, Log_In passWord2) {
		
		loginInfo1.add(username);
		loginInfo2.add(password);
		
	}
	
	
public static void main(String[] args) {
		
	}


	
}
