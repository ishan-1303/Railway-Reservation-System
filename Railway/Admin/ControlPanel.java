package Admin;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControlPanel extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel title;
	JButton viewtrn,viewres,stn,update,lout;
	ControlPanel()
	{
		super("Control Panel");
		setSize(600,500);
		setLayout(null);
		
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(d.width-getSize().width)/2;
		int y=(d.height-getSize().height)/2;
		setLocation(x,y);
		
		p1=new JPanel();
		p1.setBounds(0,0,getSize().width,100);
		p1.setLayout(null);
		p1.setBackground(new Color(102,102,102));
		
		title=new JLabel("Control Panel");
		title.setBounds(225,35,200,30);
		title.setFont(new Font("Serif",Font.BOLD,20));
		
		
		
		p2=new JPanel();
		p2.setBounds(0,100,getSize().width,getSize().height);
		p2.setLayout(null);
		p2.setBackground(new Color(153,153,153));
		
		viewtrn=new JButton("Trains");
		viewtrn.setBounds(200, 50, 175, 30);
		
		viewres=new JButton("View Reservation List");
		viewres.setBounds(200, 130, 175, 30);
		
		stn=new JButton("Station");
		stn.setBounds(200, 210, 175, 30);
		
		update=new JButton("Update Train");
		update.setBounds(200, 290, 175, 30);
		
		lout=new JButton("Log out");
		lout.setBounds(470, 10, 100, 30);
		
		p1.add(title);
		
		p2.add(viewtrn);
		p2.add(viewres);
		p2.add(stn);
		p2.add(update);
		p2.add(lout);
		
		add(p1);
		add(p2);
		
		viewtrn.addActionListener(this);
		lout.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==viewtrn)
		{
			new ViewTrains().setVisible(true);
		}
		if(ae.getSource()==lout)
		{
			new Login().setVisible(true);
			this.setVisible(false);
		}
	}
}
