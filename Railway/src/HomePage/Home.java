package HomePage;
import Reservation.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ScreenSize.LocationXY;
import javax.swing.*;
public class Home extends JFrame implements ActionListener
{
	JPanel p1,p2,p3;
	JLabel title,res,ts,src,des,title2,title3;
	JComboBox source;//,dest;
	JTextField t1;
	JButton search1,search2,map,bt;
	Connection con;
	
	public Home()
	{
		super("Trains MUMBAI-PUNE-NASHIK");
		setLayout(null);
		setSize(1366,768);
		
		p1=new JPanel();
		p1.setBounds(0,0,getSize().width,100);
		p1.setLayout(null);
		p1.setBackground(new Color(102,102,102));
		title=new JLabel("TRAINS MUMBAI-PUNE-NASHIK");
		title.setFont(new Font("Serif",Font.BOLD,20));
		title.setForeground(Color.WHITE);
		title.setBounds(508,30,350,40);
		final JLabel timeLabel = new JLabel();
		timeLabel.setBounds(1200, 30, 150, 40);
        final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        ActionListener timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Date date = new Date(System.currentTimeMillis());
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        timeLabel.setForeground(Color.WHITE);
		
        Timer timer = new Timer(1000, timerListener);
        // to make sure it doesn't wait one second at the start
        timer.setInitialDelay(0);
        timer.start();
        
		
        
		p2=new JPanel();
		p2.setBounds(300,110,getSize().width,getSize().height);
		p2.setLayout(null);
		JLabel bg=new JLabel(new ImageIcon("res\\train2.jpg"));
		bg.setBounds(0,0,1036,700);
		
		int i=270,j=100;
		
		title2=new JLabel("Train Search");
		title2.setBounds(180+i, 20, 150, 30);
		title2.setFont(new Font("Serif",Font.BOLD,20));
		
		ts=new JLabel("Train ID");
		ts.setBounds(20+i, 50+j, 100, 20);
		ts.setFont(new Font("Serif",Font.BOLD,18));
		ts.setForeground(Color.DARK_GRAY);
		
		t1=new JTextField();
		t1.setBounds(130+i,50+j,150,20);
		
		search1=new JButton("Search");
		search1.setBounds(330+i, 45+j, 80, 30);
		
		src=new JLabel("You are At");
		src.setBounds(20+i,150+j+j-35, 100, 20);
		src.setFont(new Font("Serif",Font.BOLD,18));
		src.setForeground(Color.DARK_GRAY);
		
		source=new JComboBox();
		source.setBounds(130+i, 150+j+j-35, 150, 20);
		try
		{
			showStation();
		}
		catch(Exception e)
		{
			
		}
		search2=new JButton("Search");
		search2.setBounds(330+i, 150+j+60, 80, 30);
		
		
		
		p3=new JPanel();
		p3.setBounds(0,110,290,getSize().height);
		p3.setBackground(new Color(153,153,153));
		p3.setLayout(null);
		title3=new JLabel("Reservation");
		title3.setFont(new Font("Serif",Font.BOLD,18));
		title3.setBounds(100,20,150,30);
		bt=new JButton("Book Ticket");
		bt.setBounds(85, 50+j, 120, 30);
		map=new JButton("Map");
		map.setBounds(85, 185+j, 120, 30);
		
		
		
		p1.add(title);
		p1.add(timeLabel);
	
		p2.add(t1);
		p2.add(ts);
		p2.add(search1);
		p2.add(title2);
		p2.add(src);
		//p2.add(des);
		p2.add(source);
		//p2.add(dest);
		p2.add(search2);
		p2.add(bg);
	
		p3.add(bt);
		p3.add(title3);
		p3.add(map);
		

		add(p1);
		add(p2);
		add(p3);
		//		p3.add(bg2);
		setVisible(true);
	
		bt.addActionListener(this);
		search1.addActionListener(this);
		search2.addActionListener(this);
		map.addActionListener(this);
	}
	
	public void showStation()throws Exception
	{
		
		
		 Class.forName("com.mysql.jdbc.Driver");  
	        System.out.println("Driver OK");
	        con=DriverManager.getConnection(  
	        		"jdbc:mysql://localhost:3307/railway","root","");
	        System.out.println("Connection OK");
	       
	        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
	        String sql="SELECT name FROM station ORDER BY name ASC ";
	        PreparedStatement ps=con.prepareStatement(sql);
	       // String a=(String) sourc.getSelectedItem();
	        //String b=(String) dest.getSelectedItem();
        	//ps.setString(1, a );
        	//ps.setString(2, b);
        	ResultSet rs=ps.executeQuery();
        
        	source.removeAllItems();
        	
        	while(rs.next())
        	{
        		
        		source.addItem(rs.getString(1));
        		//System.out.println(rs.getString(1));
        	}
        	
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==bt)
		{
			JOptionPane.showMessageDialog(this, "Please by selecting the station \"You are at\"", "",1);
			//this.setVisible(false);
		}
		if(ae.getSource()==search1)
		{
			if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please Enter Train ID", "", 1);
			}
			else
			{
				new Train_Report(Integer.parseInt(t1.getText()),"").setVisible(true);
			}
		}
		if(ae.getSource()==search2)
		{
			String a=(String)source.getSelectedItem();
			//String b=(String)dest.getSelectedItem();
			new Train_Report(a).setVisible(true);
		}
		if(ae.getSource()==map)
		{
			JOptionPane.showMessageDialog(this, "Under Development..Visit soon.!!", "",1);
		}
	}
	
	
	public static void main(String args[])
	{
		Home jd=new Home();
		LocationXY xy=new LocationXY();
		xy.setLocation(jd);
	}


	
}
