package Admin;

import HomePage.*;
import Reservation.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel title,uid,pwd;
	JTextField user,pass;
	JButton login,cancel;
	public Login()
	{
		super("WELCOME");
		setSize(600,400);
		
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(d.width-getSize().width)/2;
		int y=(d.height-getSize().height)/2;
		setLocation(x,y);
		
		p1=new JPanel();
		p1.setBounds(0, 0, getSize().width, 50);
		p1.setLayout(null);
		p1.setBackground(new Color(102,102,102));
		title=new JLabel("Ticket Booking");
		title.setBounds(250,10,200,30);
		
		
		
		p2=new JPanel();
		p2.setBounds(0, 55, getSize().width, getSize().height);
		p2.setLayout(null);
		p2.setBackground(new Color(153,153,153));
		
		uid=new JLabel("Login ID");
		uid.setBounds(100, 100, 100, 30);
		
		pwd=new JLabel("Passwrod");
		pwd.setBounds(100, 140, 100, 30);
		
		user=new JTextField();
		user.setBounds(200, 100, 200, 30);
		
		pass=new JTextField();
		pass.setBounds(200, 140, 200, 30);
		
		login=new JButton("Login");
		login.setBounds(200, 180, 100, 30);
		
		cancel=new JButton("Cancel");
		cancel.setBounds(300, 180, 100, 30);
		
		p2.add(uid);
		p2.add(pwd);
		
		p2.add(user);
		p2.add(pass);
		
		p2.add(login);
		p2.add(cancel);
		
		add(p1);
		add(p2);
		
		login.addActionListener(this);
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
			String u="admin";
			String p="@dmin";
			if(user.getText().equals("") || pass.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please Enter Details", "warning", 0);
			}
			else if(user.getText().equals(u) && pass.getText().equals(p))
			{
				JOptionPane.showMessageDialog(this, "Access Granted", "warning", 0);
				new ControlPanel().setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Access Denied", "warning", 0);
			}
		}
		if(ae.getSource()==cancel)
		{
			this.setVisible(false);
		}
	}
	public static void main(String args[])
	{
		Login l=new Login();
		l.setVisible(true);
	}
}
